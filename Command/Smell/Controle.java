public class Controle {
    
    private JogoFutebol futebol = new JogoFutebol();
    private JogoCorrida corrida = new JogoCorrida();

    public Controle() {

    }

    public void execute (Command command) {
        if(command.equals(Command.botaoAFutebol)) {
            futebol.chute();
        } 
        if(command.equals(Command.botaoBFutebol)) {
            futebol.carrinho();
        }
        if(command.equals(Command.botaoACorrida)) {
            corrida.acelerar();
        }
        if(command.equals(Command.botaoBCorrida)) {
            corrida.frear();
        }
    }
}