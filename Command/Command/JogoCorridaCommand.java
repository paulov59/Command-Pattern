class JogoCorridaCommand implements Command {
    
    Jogo jogo;

    public JogoCorridaCommand(Jogo jogo){
        this.jogo = jogo;
    }

    public void execute(){
        jogo.corrida();
    }
}