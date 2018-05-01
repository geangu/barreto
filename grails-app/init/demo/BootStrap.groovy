package demo

class BootStrap {

    def init = { servletContext ->
      def persona1 = new Persona(name:'Jorge',document:'123')
      persona1.save(flush:true, failOnError:true)
    }
    def destroy = {
    }
}
