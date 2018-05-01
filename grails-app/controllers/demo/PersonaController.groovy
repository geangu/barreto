package demo

class PersonaController {

  def index() {
    def list = Persona.list()
    render view:'index',model:[list:list]
  }

  def create(){
    render view:'create'
  }

  def edit(Persona p){
    render view:'edit', model:[persona:p]
  }

  def update(){
    def persona = Persona.get(params.id)
    persona.name = params.name
    persona.document = params.document
    persona.save(flush:true)
    redirect action:'index'
  }

  def delete(){
    def persona = Persona.get(params.id)
    persona.delete(flush:true)
    redirect action:'index'
  }

  def save(){
    def persona = [
      name: params.name,
      document: params.document
    ]
    new Persona(persona).save(flush:true)
    redirect action:'index'
  }
}
