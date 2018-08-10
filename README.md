# Curso de Testes Unitarios
Curso de testes unitários com Java

# Objetivo:
	Todo o material contido neste documento é oriundo do curso https://www.udemy.com/testes-unitarios-em-java,
    e tem por finalidade fornecer um breve material de consulta, com o intuito de ajudar pessoas que estejam 
    iniciando no mundo de testes unitários utilizando as ferramentas java, junit tdd, mokito, powermock etc.
	Alem deste documento auxiliar o estudante podera realizar o download de todo codigo desenvolvido no 
    endereço: https://github.com/Jrpiassa/Fontes.git.
	Os execicios deste curso foram desenvolvidos utilizando a ide eclipse, java 8, maven e sistema operacional
    linux Ubuntu 16.4.
	Ao acompanhar as video aulas eu irei anotar neste documento os conceitos que o professor ensinar, assim 
    como cada   comando ensinado e descrição do que cada comando realiza. Este repositorio é publico e espero 
    a colaboração para que possamos compartilhar entre as pessoas que estão inciando e que querem aprender 
    sobre testes unitários.

# O teste deve se dividir em três etapas
	1- Cenário
		Devemos providenciar todas as entidades que necessitamos
		para que possamos realizar a ação. 
	2- Ação
		Devemos invocar o metodo que queremos testar passando as 
		entidades que criamos no passo anterior.
	3- Validação
		Implementar manerias de checar o resultado que obtvermos
		e validar se o resultado é o esperado.

# Um teste tem que ser:
	Os testes devem ser rapidos em sua execução e ter alta disponibilidade para que possam ser executados 
    quantas vezes e quando queremos.

# Assertivas
	Assertivas é uma das caracteristicas do frameworks xunits, esta ligada diretamente a uma expressão
    lógica, se a expressão for verdadeira o teste segue o caminho, porem se o teste não	passar na assertiva
    o comportamento é o que teste falhe.

