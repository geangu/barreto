<a href="create">Crear</a>

<div>
  <ul>
    <g:each in='${list}' var="item">
      <li>
        <a href="edit?id=${item.id}">${item.id}</a>
        - ${item.name} - ${item.document} -
        <a href="delete?id=${item.id}">Borrar</a>
      </li>
    </g:each>
  </ul>
</div>
