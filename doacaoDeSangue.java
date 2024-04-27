import javax.swing.JOptionPane;

public class doacaoDeSangue {
        public static void main(String[] args) {
                boolean voltarMenu = true;

                JOptionPane.showMessageDialog(null, "SISTEMA DE DOAÇÃO DE SANGUE:\r\n" +
                                "-------------------------------------------------------------------------------------------------------------------------------------\r\n"
                                +
                                "Bem-vindo ao nosso Programa de Doação de Sangue.\r\n Agradecemos o seu interesse em contribuir para salvar vidas. \r\n"
                                +
                                " A doação de sangue é um gesto de solidariedade e uma ação essencial que ajuda hospitais \r\n a cuidar eficientemente de pacientes em emergência.\r\n"
                                +
                                "------------------------------------------------------------------------------------------------------------------------------------- ");

                while (voltarMenu) {
                        String escolha = JOptionPane.showInputDialog("*MENU*\r\n" +
                                        "-------------------------------------------------------------------------------------------------------------------------------------\r\n"
                                        +
                                        "1. Verificação de Elegibilidade\r\n" +
                                        "  \r\n" +
                                        "2. Agendamento de Doação\r\n" +
                                        "\r\n" +
                                        "3. Procedimentos de Doação\r\n" +
                                        "\r\n" +
                                        "4.Quiz\r\n" +
                                        "\r\n" +
                                        "5.Sair\r\n" +
                                        "\r\n" +
                                        "Escolha uma opção do menu para continuar sua   doação de sangue e fazer a diferença na vida de muitas pessoas.\r\nSe tiver dúvidas, estamos aqui para ajudar!\r\n"
                                        +
                                        "  ---------------------------------------------------------------------------------------------------------------------------------------------");

                        if (escolha == null) {
                                voltarMenu = false;
                        }

                        int escolhaNum = Integer.parseInt(escolha);

                        switch (escolhaNum) {
                                case 1:
                                        VerificarElegibilidade();
                                        break;
                                case 2:
                                        AgendamentoDeDoacao();
                                        break;
                                case 3:
                                        ProcedimentosDeDoacao();
                                        break;
                                case 4:
                                        Quiz();
                                        break;
                                case 5:
                                        JOptionPane.showMessageDialog(null,
                                                        "A doação de sangue é um ato nobre e solidário que desempenha um papel vital na saúde.\r\n"
                                                                        +
                                                                        "Por meio da doação, os bancos de sangue podem fornecer transfusões sanguíneas a pacientes \r\n"
                                                                        +
                                                                        "que enfrentam condições médicas graves ou submetidos a cirurgias complexas.");
                                        JOptionPane.showMessageDialog(null,
                                                        "Obrigado por considerar a doação de sangue. Seu gesto pode salvar vidas!");
                                        voltarMenu = false;
                                        break;
                                default:
                                        JOptionPane.showMessageDialog(null, "Opção invalida tente novamente!");
                                        break;
                        }
                }
        }

        public static void VerificarElegibilidade() {
                String sexo = JOptionPane.showInputDialog("Digite seu sexo:\n\r" +
                                "Digite 1 para Feminino \n\r"
                                + "Digite 2 para Masculino");
                String nome = JOptionPane.showInputDialog("Digite seu nome:");
                String idade = JOptionPane.showInputDialog("Digite sua idade:");
                String peso = JOptionPane.showInputDialog("Digite seu peso:");
                int idadeNum = Integer.parseInt(idade);
                int pesoNum = Integer.parseInt(peso);
                int sexoNum = Integer.parseInt(sexo);

                // caso seja mulher
                if (idadeNum >= 16 && idadeNum <= 69 && pesoNum >= 50 && pesoNum <= 140 && sexoNum == 1) {

                        String Resfriado = JOptionPane
                                        .showInputDialog("Você esteve resfriado nos ultimos 7 dias? [S/N] ");
                        Resfriado = Resfriado.toUpperCase();

                        if (Resfriado.equalsIgnoreCase("S")) {
                                JOptionPane.showMessageDialog(null, "Usuário não apto a doação no momento");
                        } else {
                                String Gravida = JOptionPane.showInputDialog("Você está gravida? [S/N] ");
                                Gravida = Gravida.toUpperCase();
                                if (Gravida.equalsIgnoreCase("S")) {
                                        JOptionPane.showMessageDialog(null, "Usuário não apto a doação no momento");
                                } else {
                                        String Alcool = JOptionPane.showInputDialog(
                                                        "Você ingeriu álcool nas ultimas 12 horas? [S/N]");
                                        Alcool = Alcool.toUpperCase();
                                        if (Alcool.equalsIgnoreCase("S")) {
                                                JOptionPane.showMessageDialog(null,
                                                                "Usuário não apto a doação no momento");
                                        } else {
                                                String Tinta = JOptionPane.showInputDialog(
                                                                "Você fez tatuagem, maquiagem definitiva ou micropigmentação nos ultimos 6 meses? [S/N]");
                                                Tinta = Tinta.toUpperCase();
                                                if (Tinta.equalsIgnoreCase("S")) {
                                                        JOptionPane.showMessageDialog(null,
                                                                        "Usuário não apto a doação no momento");
                                                } else {
                                                        String Ferro = JOptionPane
                                                                        .showInputDialog(
                                                                                        "Você colocou piercing ou brinco nos ultimos 6 meses? [S/N]");
                                                        Ferro = Ferro.toUpperCase();
                                                        if (Ferro.equalsIgnoreCase("S")) {
                                                                JOptionPane.showMessageDialog(null,
                                                                                "Usuário não apto a doação no momento");
                                                        } else {
                                                                String risco = JOptionPane.showInputDialog(
                                                                                "Você já esteve em situações nas quais há maior risco de adquirir doenças sexualmente transmissíveis? [S/N]");

                                                                risco = risco.toUpperCase();
                                                                if (risco.equalsIgnoreCase("S")) {
                                                                        JOptionPane.showMessageDialog(null,
                                                                                        "Usuário não apto a doação no momento");
                                                                } else {
                                                                        String vacina = JOptionPane.showInputDialog(
                                                                                        "Você se vacinou contra gripe, covid-19 ou dengue nas ultimas 4 semanas? [S/N] ");
                                                                        vacina = vacina.toUpperCase();
                                                                        if (vacina.equalsIgnoreCase("S")) {
                                                                                JOptionPane.showMessageDialog(null,
                                                                                                "Usuário não apto a doação no momento");
                                                                        } else {
                                                                                String doencas = JOptionPane
                                                                                                .showInputDialog(
                                                                                                                "Você já teve Febre Amarela, Covid-19 ou Dengue nos ultimos 6 meses? [S/N] ");
                                                                                doencas = doencas.toUpperCase();
                                                                                if (doencas.equalsIgnoreCase("S")) {
                                                                                        JOptionPane.showMessageDialog(
                                                                                                        null,
                                                                                                        "Usuário não apto a doação no momento");
                                                                                } else {
                                                                                        String doencasDefinitivas = JOptionPane
                                                                                                        .showInputDialog(
                                                                                                                        "Você teve Malária, Hepatite, Hiv, Fez uso de Droga injetaveis, doença de parkinson ou possui alguma IST(Infecções Sexualmente Transmissíveis)? [S/N]");
                                                                                        doencasDefinitivas = doencasDefinitivas
                                                                                                        .toUpperCase();
                                                                                        if (doencasDefinitivas
                                                                                                        .equalsIgnoreCase(
                                                                                                                        "S")) {
                                                                                                JOptionPane.showMessageDialog(
                                                                                                                null,
                                                                                                                "Usuário não apto a doação no momento");
                                                                                        } else {
                                                                                                String doacaoM = JOptionPane
                                                                                                                .showInputDialog(
                                                                                                                                "Você doou sangue nos ultimos 90 dias? [S/N]");
                                                                                                if (doencasDefinitivas
                                                                                                                .equalsIgnoreCase(
                                                                                                                                "S")) {
                                                                                                        JOptionPane.showMessageDialog(
                                                                                                                        null,
                                                                                                                        "Usuário não apto a doação no momento");
                                                                                                } else {
                                                                                                        JOptionPane.showMessageDialog(
                                                                                                                        null,
                                                                                                                        "Usuário apto a doar sangue no momento");
                                                                                                }
                                                                                        }
                                                                                }
                                                                        }
                                                                }
                                                        }
                                                }
                                        }
                                }
                        }
                } else if (idadeNum >= 16 && idadeNum <= 69 && pesoNum >= 50 && pesoNum <= 140 && sexoNum == 2) {
                        String Resfriado = JOptionPane
                                        .showInputDialog("Você esteve resfriado nos ultimos 7 dias? [S/N] ");
                        Resfriado = Resfriado.toUpperCase();

                        if (Resfriado.equalsIgnoreCase("S")) {
                                JOptionPane.showMessageDialog(null, "Usuário não apto a doação no momento");
                        } else {
                                String Alcool = JOptionPane.showInputDialog(
                                                "Você ingeriu álcool nas ultimas 12 horas? [S/N]");
                                Alcool = Alcool.toUpperCase();
                                if (Alcool.equalsIgnoreCase("S")) {
                                        JOptionPane.showMessageDialog(null,
                                                        "Usuário não apto a doação no momento");
                                } else {
                                        String Tinta = JOptionPane.showInputDialog(
                                                        "Você fez tatuagem, maquiagem definitiva ou micropigmentação nos ultimos 6 meses? [S/N]");
                                        Tinta = Tinta.toUpperCase();
                                        if (Tinta.equalsIgnoreCase("S")) {
                                                JOptionPane.showMessageDialog(null,
                                                                "Usuário não apto a doação no momento");
                                        } else {
                                                String Ferro = JOptionPane
                                                                .showInputDialog(
                                                                                "Você colocou piercing ou brinco nos ultimos 6 meses? [S/N]");
                                                Ferro = Ferro.toUpperCase();
                                                if (Ferro.equalsIgnoreCase("S")) {
                                                        JOptionPane.showMessageDialog(null,
                                                                        "Usuário não apto a doação no momento");
                                                } else {
                                                        String risco = JOptionPane.showInputDialog(
                                                                        "Você já esteve em situações nas quais há maior risco de adquirir doenças sexualmente transmissíveis? [S/N]");

                                                        risco = risco.toUpperCase();
                                                        if (risco.equalsIgnoreCase("S")) {
                                                                JOptionPane.showMessageDialog(null,
                                                                                "Usuário não apto a doação no momento");
                                                        } else {
                                                                String vacina = JOptionPane.showInputDialog(
                                                                                "Você se vacinou contra gripe, covid-19 ou dengue nas ultimas 4 semanas? [S/N] ");
                                                                vacina = vacina.toUpperCase();
                                                                if (vacina.equalsIgnoreCase("S")) {
                                                                        JOptionPane.showMessageDialog(null,
                                                                                        "Usuário não apto a doação no momento");
                                                                } else {
                                                                        String doencas = JOptionPane
                                                                                        .showInputDialog(
                                                                                                        "Você já teve Febre Amarela, Covid-19 ou Dengue nos ultimos 6 meses? [S/N] ");
                                                                        doencas = doencas.toUpperCase();
                                                                        if (doencas.equalsIgnoreCase("S")) {
                                                                                JOptionPane.showMessageDialog(
                                                                                                null,
                                                                                                "Usuário não apto a doação no momento");
                                                                        } else {
                                                                                String doencasDefinitivas = JOptionPane
                                                                                                .showInputDialog(
                                                                                                                "Você teve Malária, Hepatite, Hiv, Fez uso de Droga injetaveis, doença de parkinson ou possui alguma IST(Infecções Sexualmente Transmissíveis)? [S/N]");
                                                                                doencasDefinitivas = doencasDefinitivas
                                                                                                .toUpperCase();
                                                                                if (doencasDefinitivas
                                                                                                .equalsIgnoreCase(
                                                                                                                "S")) {
                                                                                        JOptionPane.showMessageDialog(
                                                                                                        null,
                                                                                                        "Usuário não apto a doação no momento");
                                                                                } else {
                                                                                        String doacaoM = JOptionPane
                                                                                                        .showInputDialog(
                                                                                                                        "Você doou sangue nos ultimos 60 dias? [S/N]");
                                                                                        doacaoM = doacaoM
                                                                                                        .toUpperCase();
                                                                                        if (doacaoM
                                                                                                        .equalsIgnoreCase(
                                                                                                                        "S")) {
                                                                                                JOptionPane.showMessageDialog(
                                                                                                                null,
                                                                                                                "Usuário não apto a doação no momento");
                                                                                        } else {
                                                                                                JOptionPane.showMessageDialog(
                                                                                                                null,
                                                                                                                "Usuário apto a doar sangue no momento");
                                                                                        }
                                                                                }
                                                                        }
                                                                }
                                                        }
                                                }
                                        }
                                }
                        }
                } else {
                        JOptionPane.showMessageDialog(null, "Usuário não apto a doação no momento");
                }
        }

        public static void AgendamentoDeDoacao() {
                JOptionPane.showMessageDialog(null, "Agendamento de Doação\r \n" +
                                "Horários de Atendimento: 09h às 18h\r\n"
                                +
                                "Locais: Posto de Saúde mais próximo da sua residência");

                String nomeAgend = JOptionPane.showInputDialog("Agende seu horário:\r\n" +
                                " \r\n" +
                                " Informe o seu nome:  ");

                String dataAgend = JOptionPane.showInputDialog("Informe a data (dd/mm): ");
                String hora = JOptionPane.showInputDialog("Informe o horário (00): ");
                int horaAgend = Integer.parseInt(hora);

                if (horaAgend < 9 || horaAgend > 18) {
                        JOptionPane.showMessageDialog(null, "Preencha os campos corretamente!");
                } else {
                        JOptionPane.showMessageDialog(null, "Agendamento feito com sucesso\r\n" +
                                        nomeAgend + " " + dataAgend + " às " + horaAgend + "h");
                }
        }

        public static void ProcedimentosDeDoacao() {
                // Primeiro passo: Preparação
                JOptionPane.showMessageDialog(null, "Preparação:\n\r" +
                                "\r\n"
                                + "Recepção e cadastro:\r\n" +
                                "Ao chegar ao local é feito primeiramente um cadastro com dados pessoais e gerais.\r\n Lembre-se sempre de levar documento oficial de identidade com foto (RG, carteira de motorista, carteira de trabalho ou passaporte).\r\n"
                                +
                                "\r\n"
                                + "Triagem clínica\r\n" +
                                "Após o cadastro ocorre a triagem clínica. Uma entrevista que avalia as condições de saúde da pessoa que vai doar e os riscos para a pessoa que vai receber.\r\n Na triagem clínica, são feitas perguntas a respeito do estado de saúde do candidato à doação de sangue.\r\n A triagem clínica é utilizada, pois existem questões que podem ser identificadas na entrevista clínica e não podem ser detectada por testes laboratoriais.");
                // Segundo passo: Coleta
                JOptionPane.showMessageDialog(null, "Coleta:\r\n" +
                                "\r"
                                + "A coleta do sangue dura em torno de 15 minutos.\r\n Ela é feita com material esterilizado, descartável e não apresenta nenhum risco para a pessoa que está doando.");
                // Terceiro passo: Cuidados pós-doação
                JOptionPane.showMessageDialog(null, "Cuidados pós-doação:\r\n" +
                                "\r\n"
                                + "Depois de doar sangue Faça um pequeno lanche e hidrate-se.\r\nÉ importante para o doador continuar se sentindo bem durante o dia. \r\nÉ necessário também evitar esforços físicos exagerados por pelo menos 12 horas,\r\nnão fumar por cerca de 2 horas, evitar bebidas alcóolicas por 12 horas\r\ne não dirigir veículos de grande porte, trabalhar em andaimes, praticar paraquedismo ou mergulho.");
        }

        public static void Quiz() {
                JOptionPane.showMessageDialog(null, "Quiz\r\n" +
                                "Prove seu conhecimento sobre doação de sangue com o quiz a seguir.");

                String um = JOptionPane.showInputDialog(
                                "1-A partir de qual idade você pode começar a doar sangue ?\r\n" + "\r\n"
                                                + "A-15\r\n" +
                                                "B-16\r\n" +
                                                "C-14");
                if (um.equalsIgnoreCase("B")) {
                        JOptionPane.showMessageDialog(null, "Certa Resposta!");

                        String dois = JOptionPane.showInputDialog(
                                        "2-Quais os cuidados você tem que ter antes de doar sangue ?\r\n" + "\r\n"
                                                        + "A-Estar em boas condições de saúde\r\n" +
                                                        "B-Estar descansado (ter dormido pelo menos 6 horas nas últimas 24 horas)\r\n"
                                                        +
                                                        "C-Estar em boas condições de saúde, estar descansado (ter dormido pelo menos 6 horas nas últimas 24 horas) e  estar alimentado (evitar alimentação gordurosa nas 4 horas que antecedem a doação).");

                        if (dois.equalsIgnoreCase("C")) {
                                JOptionPane.showMessageDialog(null, "Certa Resposta!");
                                String tres = JOptionPane
                                                .showInputDialog("3-Qual o requisito de peso para doar?\r\n" + "\r\n"
                                                                + "A-Pesar no mínimo 50 kg\r\n" +
                                                                "B-Pesar no mínimo 50 kg e pesar menos que 140 kg\r\n" +
                                                                "C-Pesar mais que 140 kg");
                                if (tres.equalsIgnoreCase("B")) {
                                        JOptionPane.showMessageDialog(null, "Certa Resposta!");
                                        String quatro = JOptionPane
                                                        .showInputDialog(
                                                                        "4-Quais condições abaixo são impedimentos definitivos na doação de sangue?\r\n"
                                                                                        + "\r\n"
                                                                                        + "A-Hepatite, HIV, Malária, Doença de Parkinson\r\n"
                                                                                        +
                                                                                        "B-Covid-19, Gripe, Dengue\r\n"
                                                                                        +
                                                                                        "C-Gravidez, Tatuagem, Brinco");
                                        if(quatro.equalsIgnoreCase("A")){
                                                JOptionPane.showMessageDialog(null, "Certa Resposta!");
                                                JOptionPane.showMessageDialog(null, "Parabéns, você acertou todas as nossas perguntas, esperamos que você tenha gostado do nosso  quiz!");
                                        }

                                } else {
                                        JOptionPane.showMessageDialog(null, "Resposta Incorreta, tente novamente!");
                                }
                        } else {
                                JOptionPane.showMessageDialog(null, "Resposta Incorreta, tente novamente!");
                        }
                } else {
                        JOptionPane.showMessageDialog(null, "Resposta Incorreta, tente novamente!");
                }
        }
}
