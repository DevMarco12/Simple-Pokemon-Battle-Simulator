class Main {
  public static void main(String[] args) {
        System.out.println("-- Bem-vindo ao Estádio de Batalha Pokémon --\n");
        
        //Instanciar um novo objeto
        Pokemon meuPokemon = new Pokemon("Charmander", "Fogo", 17);
        Pokemon outroPokemon = new Pokemon("Squirtle", "Agua", 16);
                           
        meuPokemon.imprimiPokemon();
        outroPokemon.imprimiPokemon();
      
        PokemonBattle pokemonBattle = new PokemonBattle();
        pokemonBattle.BattleSimulation(meuPokemon, outroPokemon);       
  }
}