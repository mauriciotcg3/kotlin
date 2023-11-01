fun main(args: Array<String>) {
    var nomes = arrayOf(
        "João Silva Pereira", "Maria Santos Oliveira", "Pedro Almeida Carvalho", "Ana Rodrigues Gonçalves", "Carlos Fernandes Costa", "Isabel Pereira Ribeiro", "Luís Almeida Teixeira", "Lúcia Santos Barbosa", "Ricardo Gonçalves Pereira", "Marta Rodrigues Ferreira", "António Teixeira Oliveira", "Sofia Fernandes Costa", "Fernando Silva Almeida", "Catarina Pereira Ribeiro",
        "Miguel Almeida Carvalho", "Teresa Gonçalves Rodrigues", "Manuel Fernandes Teixeira", "Beatriz Ribeiro Pereira", "Hugo Costa Almeida", "Vera Santos Gonçalves", "Paulo Alves Ribeiro", "Cláudia Mendes Silva", "André Sousa Oliveira", "Helena Costa Rodrigues", "Nuno Pereira Almeida", "Inês Gonçalves Teixeira", "Fábio Alves Ribeiro", "Sara Fernandes Costa", "Gonçalo Silva Oliveira", "Lara Rodrigues Ferreira", "José Pereira Almeida", "Carolina Santos Ribeiro", "Rui Teixeira Oliveira",
        "Ingrid Fernandes Costa", "Guilherme Almeida Barbosa", "Tatiana Oliveira Silva", "Rafael Carvalho Pereira", "Daniela Costa Rodrigues", "Leandro Santos Ribeiro", "Clara Oliveira Almeida", "Bruno Pereira Costa", "Mariana Rodrigues Gonçalves", "Tiago Silva Almeida", "Isabela Ribeiro Teixeira", "Davi Almeida Costa",
        "Larissa Teixeira Gonçalves", "Marcelo Fernandes Pereira", "Fernanda Santos Oliveira", "Vinícius Pereira Costa", "Lucas Alves Ribeiro", "Mirella Gonçalves Silva", "Joana Oliveira Teixeira", "Gustavo Carvalho Almeida", "Larissa Costa Ribeiro", "Lucas Ribeiro Teixeira", "Matheus Almeida Gonçalves", "Valentina Santos Costa", "Felipe Fernandes Silva", "Gabriela Pereira Teixeira", "Leonardo Costa Almeida", "Nina Gonçalves Ribeiro", "Daniel Silva Teixeira", "Eduarda Alves Oliveira", "Sophia Pereira Ribeiro", "Isaac Fernandes Costa", "Lorenzo Almeida Teixeira", "Júlia Teixeira Gonçalves", "Bianca Santos Almeida", "Arthur Rodrigues Costa",
        "Amanda Oliveira Silva", "Laura Almeida Teixeira", "Enzo Ribeiro Pereira", "Alice Fernandes Costa", "João Miguel Silva Oliveira", "Isadora Santos Ribeiro", "Gabriel Teixeira Almeida", "Miguel Pereira Costa", "Luna Gonçalves Ribeiro", "Theo Oliveira Teixeira", "Sophie Almeida Costa", "Cauã Rodrigues Silva", "Marina Santos Pereira", "Benjamin Ribeiro Teixeira", "Larissa Fernandes Almeida", "Enzo Costa Gonçalves", "Ana Clara Alves Teixeira", "Luiza Pereira Ribeiro", "Thiago Oliveira Costa", "Fernanda Fernandes Silva", "Caio Almeida Pereira", "Clara Santos Costa", "Lucas Rodrigues Teixeira", "Eduardo Teixeira Gonçalves", "Lorena Pereira Almeida", "Pedro Henrique Costa Ribeiro", "Helena Almeida Silva", "Samuel Fernandes Oliveira", "Bruna Ribeiro Teixeira", "Raul Silva Costa", "Mariana Pereira Almeida",
    )

    var sexos = arrayOf(
        "Masculino", "Feminino", "Masculino", "Feminino", "Masculino", "Feminino", "Masculino", "Feminino", "Masculino", "Feminino",
        "Masculino", "Feminino", "Masculino", "Feminino", "Masculino", "Feminino", "Masculino", "Feminino", "Masculino", "Feminino",
        "Masculino", "Feminino", "Masculino", "Feminino", "Masculino", "Feminino", "Masculino", "Feminino", "Masculino", "Feminino",
        "Masculino", "Feminino", "Masculino", "Feminino", "Masculino", "Feminino", "Masculino", "Feminino", "Masculino", "Feminino",
        "Masculino", "Feminino", "Masculino", "Feminino", "Masculino", "Feminino", "Masculino", "Feminino", "Masculino", "Feminino",
        "Masculino", "Feminino", "Masculino", "Feminino", "Masculino", "Feminino", "Masculino", "Feminino", "Masculino", "Feminino",
        "Masculino", "Feminino", "Masculino", "Feminino", "Masculino", "Feminino", "Masculino", "Feminino", "Masculino", "Feminino",
        "Masculino", "Feminino", "Masculino", "Feminino", "Masculino", "Feminino", "Masculino", "Feminino", "Masculino", "Feminino",
        "Masculino", "Feminino", "Masculino", "Feminino", "Masculino", "Feminino", "Masculino", "Feminino", "Masculino", "Feminino",
        "Masculino", "Feminino", "Masculino", "Feminino", "Masculino", "Feminino", "Masculino", "Feminino", "Masculino", "Feminino"
    )

    var idades = arrayOf(
        25, 32, 42, 28, 35, 47, 20, 31, 56, 40, 22, 29, 38, 50, 27, 33, 44, 21, 37, 48, 26, 41, 30, 54, 36, 23, 39, 46, 24, 52, 34, 47, 20, 43, 55, 45, 60, 19, 53, 49, 58, 18, 51, 57, 61, 64, 63, 59, 62, 68, 70, 72, 66, 65, 71, 75, 69, 67, 74, 76, 73, 80, 78, 77, 79, 84, 82, 85, 81, 88, 90, 87, 83, 86, 92, 93, 89, 91, 94, 97, 95, 96, 98, 99, 100, 102, 105, 103, 101, 104, 107, 106, 108, 109, 110, 112, 111, 113, 115, 114
    )

    var cargos = arrayOf(  "Desenvolvedor de Software", "Engenheiro de Software", "Analista de Sistemas", "Administrador de Redes", "Arquiteto de Soluções", "Designer de Interface de Usuário (UI/UX)", "Engenheiro de Dados", "Cientista de Dados", "Analista de Segurança da Informação", "Administrador de Banco de Dados", "Especialista em Cloud Computing", "Analista de Qualidade de Software",
        "Gerente de Projetos de T.I", "Analista de Suporte Técnico", "Especialista em Redes e Telecomunicações", "Desenvolvedor Web", "Analista de Business Intelligence", "Engenheiro de DevOps", "Analista de Business Analyst", "Especialista em Inteligência Artificial", "Administrador de Sistemas", "Especialista em Machine Learning", "Engenheiro de Site Reliability (SRE)",
        "Desenvolvedor Front-end", "Desenvolvedor Back-end", "Especialista em Cibersegurança", "Analista de Dados Empresariais", "Engenheiro de Redes", "Desenvolvedor Mobile", "Analista de Suporte ao Cliente", "Engenheiro de Redes e Segurança", "Especialista em Big Data", "Engenheiro de Software Embarcado", "Analista de Infraestrutura de T.I", "Especialista em Realidade Virtual", "Engenheiro de Software de Jogos", "Desenvolvedor de Aplicativos Móveis", "Analista de Sistemas ERP", "Especialista em Sistemas Embarcados", "Especialista em Blockchain", "Administrador de Banco de Dados Oracle", "Analista de Dados de Negócios", "Analista de Integração de Sistemas", "Desenvolvedor Full-Stack", "Especialista em Business Intelligence", "Engenheiro de Dados de Negócios", "Administrador de Banco de Dados SQL Server", "Especialista em Engenharia de Dados", "Analista de Suporte a Servidores", "Engenheiro de Dados de Nuvem", "Analista de Requisitos de Software", "Desenvolvedor Java", "Engenheiro de Software C++", "Analista de Infraestrutura de Nuvem", "Analista de Sistemas Web", "Engenheiro de Software Python", "Especialista em Segurança de Rede", "Engenheiro de Software Ruby", "Especialista em Redes Sem Fio", "Administrador de Banco de Dados MySQL", "Analista de Suporte a Redes",
        "Desenvolvedor PHP", "Engenheiro de Software .NET", "Analista de Suporte de Aplicativos", "Especialista em Redes Cisco", "Engenheiro de Software JavaScript", "Analista de Redes e Comunicações", "Especialista em Virtualização", "Administrador de Banco de Dados MongoDB", "Analista de Segurança de Rede", "Desenvolvedor Swift", "Especialista em Redes Juniper", "Engenheiro de Software Go", "Analista de Redes de Computadores", "Especialista em Segurança de Aplicativos", "Engenheiro de Software Kotlin", "Especialista em Inteligência de Negócios", "Analista de Banco de Dados",
        "Analista de Suporte a Sistemas", "Especialista em Automação de Redes", "Engenheiro de Software Rust", "Desenvolvedor de Jogos", "Analista de Testes de Software", "Especialista em Análise de Dados", "Analista de Infraestrutura de Banco de Dados", "Desenvolvedor de Aplicativos Web", "Especialista em Gerenciamento de Projetos", "Analista de Operações de T.I", "Especialista em Computação em Nuvem", "Engenheiro de Software Scala", "Analista de Suporte de Desktop", "Analista de Redes Sociais", "Desenvolvedor de Aplicativos de Realidade Aumentada", "Especialista em Automação de Processos", "Analista de Segurança de Aplicativos", "Analista de Suporte a Datacenter", "Especialista em Automação de Testes", "Engenheiro de Software TypeScript", "Desenvolvedor de Aplicativos Híbridos", "Analista de Suporte Técnico de Nuvem")

    var salarios = arrayOf(3500, 4200, 5100, 4800, 6300, 3800, 4900, 5600, 7200, 3600, 4500, 5800, 6000, 4700, 4300, 5500, 6800, 7500, 4000, 5700, 4100, 4400, 6200, 5400, 7000, 4600, 6600, 5900, 5200, 5300, 4800, 6100, 3900, 6700, 4800, 4200, 6800, 7300, 5700, 4500, 4000, 5000, 6400, 3800, 7600, 6500, 5100, 5600, 4900, 7400, 4300, 3600, 5300, 5400, 5900, 4700, 6200, 4100, 7200, 6300, 4400, 5800, 7800, 6700, 6000, 5000, 3900, 4700, 6900, 5500, 4600, 4800, 7000, 5700, 4500, 6500, 7500, 3500, 4300, 6600, 4000, 6100, 7700, 5200, 4200, 6400, 5800, 3800, 7300, 4100, 5400, 7600, 4900, 5300, 6800, 6300, 4400, 6300, 3800, 4900)

    var homemVelho = ""; var mulherVelha = ""; var homemNovo = ""; var mulherNova = ""
    var maiorHomem = 0; var maiorMulher = 0; var menorHomem = 0; var menorMulher = 0

    var mediaHomens = 0; var mediaMulheres = 0; var mediaTodos = 0;
    var qtdHomens = 0; var qtdMulheres = 0

    var maiorSalarioMasculino = 0; var menorSalarioMasculino = 0; var maiorSalarioFeminino = 0; var menorSalarioFeminino = 0

    var masculinoMaiorSalario = ""; var masculinoMenorSalario = ""; var femininoMaiorSalario = ""; var femininoMenorSalario = ""
    var salarioMedioMasculino = 0; var salarioMedioFeminino = 0; var salarioMedioTodos = 0;

    var diretorMaiorSalario = 0; var nomeDiretor = "";
    var maiorNome = ""; var pessoas18Anos = ""; var nomeInicialA = ""

    var listaPessoas18 = mutableListOf<String>()
    var listaPessoasInicialA = mutableListOf<String>()

    for (i in 0..99) {
        if ( sexos.get(i).equals("Masculino")) {
            if (maiorHomem == 0) maiorHomem = idades.get(i)
            else if (maiorHomem < idades.get(i)) {
                homemVelho = nomes.get(i)
                maiorHomem = idades.get(i)
            }

            if (menorHomem == 0) menorHomem = idades.get(i)
            else if(menorHomem > idades.get(i)) {
                homemNovo = nomes.get(i)
                menorHomem = idades.get(i)
            }

            if (maiorSalarioMasculino == 0) maiorSalarioMasculino = salarios.get(i)
            else if (maiorSalarioMasculino < salarios.get(i)) {
                masculinoMaiorSalario = nomes.get(i)
                maiorSalarioMasculino = salarios.get(i)
            }

            if (menorSalarioMasculino == 0) menorSalarioMasculino = salarios.get(i)
            else if(menorSalarioMasculino > salarios.get(i)) {
                masculinoMenorSalario = nomes.get(i)
                menorSalarioMasculino = salarios.get(i)
            }
            qtdHomens++
            mediaHomens += idades.get(i)
            salarioMedioMasculino += salarios.get(i)
        }

        if (sexos.get(i).equals("Feminino")) {
            if(maiorMulher < idades.get(i)) {
                mulherVelha = nomes.get(i)
                maiorMulher = idades.get(i)
            }

            if(menorMulher == 0) menorMulher = idades.get(i)
            else if(menorMulher > idades.get(i) && sexos.get(i).equals("Feminino")) {
                mulherNova = nomes.get(i)
                menorMulher = idades.get(i)
            }

            if (maiorSalarioFeminino < salarios.get(i)) {
                femininoMaiorSalario = nomes.get(i)
                maiorSalarioFeminino = salarios.get(i)
            }

            if (menorSalarioFeminino == 0) menorSalarioFeminino = salarios.get(i)
            else if(menorSalarioFeminino > salarios.get(i)) {
                femininoMenorSalario = nomes.get(i)
                menorSalarioFeminino = salarios.get(i)
            }
            qtdMulheres++
            mediaMulheres += idades.get(i)
            salarioMedioFeminino += salarios.get(i)
        }

        if(cargos.get(i).equals("Diretor")) {
            if (diretorMaiorSalario < salarios.get(i)) {
                nomeDiretor = nomes.get(i)
                diretorMaiorSalario = salarios.get(i)
            }
        }

        if(maiorNome.length < nomes.get(i).length) maiorNome = nomes.get(i)

        if(idades.get(i) == 18) listaPessoas18.add(nomes.get(i))

        if(nomes.get(i).substring(0,1) == "A") {
            listaPessoasInicialA.add(nomes.get(i))
        }
        mediaTodos += idades.get(i)
        salarioMedioTodos += salarios.get(i)
    }

    mediaHomens /= qtdHomens
    mediaMulheres /= qtdMulheres
    mediaTodos /= idades.size

    salarioMedioMasculino /= qtdHomens
    salarioMedioFeminino /= qtdMulheres
    salarioMedioTodos /= salarios.size

    println("O homem mais velho é: $homemVelho com idade de: $maiorHomem")
    println("\nA mulher mais velha é: $mulherVelha com idade de: $maiorMulher")
    println("\nO homem mais novo é: $homemNovo com idade de: $menorHomem")
    println("\nA mulher mais nova é: $mulherNova com idade de: $menorMulher")

    println("\nIdade média dos homens é: $mediaHomens")
    println("\nIdade média das mulheres é: $mediaMulheres")
    println("\nIdade média independente do sexo é: $mediaTodos")

    println("\nO homem com o maior salário é: $masculinoMaiorSalario com o salário de: $maiorSalarioMasculino")
    println("\nO homem com o menor salário é:  $masculinoMenorSalario com o salário de: $menorSalarioMasculino")
    println("\nA mulher com o maior salário é:  $femininoMaiorSalario com o salário de: $maiorSalarioFeminino")
    println("\nA mulher com o menor salário é: $femininoMenorSalario com o salário de: $menorSalarioFeminino")

    println("\nMédia dos salários dos homens é:  $salarioMedioMasculino")
    println("\nMédia dos salários das mulheres é:  $salarioMedioFeminino")
    println("\nMédia dos salários independente do sexo é: $salarioMedioTodos")

    println("\nA pessoa com o cargo “Diretor” que possui o maior salário é: $nomeDiretor com o salário de: $diretorMaiorSalario")
    println("\nA pessoa que tem o maior nome na empresa é: $maiorNome contendo ${maiorNome.length} caracteres")
    println("\nPessoas que possuem 18 anos {")
    for (nome in listaPessoas18) {
        println("$nome")
    }
    println("}")

    println("\nPessoas que tem o nome iniciado em 'A' é: {")
    for (nome in listaPessoasInicialA) {
        println("$nome")
    }
    println("}")
}