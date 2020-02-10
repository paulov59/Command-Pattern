class JogoFutebolCommand implements Command {
    
    Jogo jogo;

    public JogoFutebolCommand(Jogo jogo){
        this.jogo = jogo;
    }

    public void execute(){
        jogo.futebol();
    }
}