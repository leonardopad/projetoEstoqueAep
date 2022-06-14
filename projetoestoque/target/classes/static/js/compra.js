const listBody = document.getElementById("list-body");


function addCompra (){
	const nomeProduto = document.getElementById("nomeProduto").value;
	const quantidade = document.getElementById("quantidade").value;
	const validade = document.getElementById("validade").value;
	
	const tipo = document.getElementById("tipo");
	const tipoSelecionado = tipo.options[tipo.selectedIndex].text;
	const situacao = document.getElementById("situacao");
	const situacaoSelecionado = situacao.options[situacao.selectedIndex].text;
	
	console.log(nomeProduto);
	var tr = document.createElement("tr");
	
	var tdNome = document.createElement("td");
	tdNome.appendChild(document.createTextNode(nomeProduto));
	
	var tdQuantidade = document.createElement("td");
	tdQuantidade.appendChild(document.createTextNode(quantidade));
	
	var tdValidade = document.createElement("td");
	tdValidade.appendChild(document.createTextNode(validade));
	
	var tdTipo = document.createElement("td");
	tdTipo.appendChild(document.createTextNode(tipoSelecionado));
	
	var tdSituacao = document.createElement("td");
	tdSituacao.appendChild(document.createTextNode(situacaoSelecionado));
	
	tr.appendChild(tdNome);
	tr.appendChild(tdQuantidade); 
	tr.appendChild(tdValidade);
	tr.appendChild(tdTipo);
	tr.appendChild(tdSituacao);
	listBody.appendChild(tr);
}