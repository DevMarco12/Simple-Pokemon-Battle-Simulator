public class Pokemon {
    
    //Atributos genéricos de um pokémon
    //Encapsulamento
    private String nome;
    private String tipo;
    private int level;
    private int vida = 100;
    private int ataque;
    private int defesa;
    
    //Construtor da Classe
    public Pokemon(String nome, String tipo, int level){
        this.nome = nome;
        this.tipo = tipo;
        this.level = level;
                
        calculaAtributos();
        calculaBonus();
    }
    
    //Get
    public String getNome(){
      return this.nome;
    }

    public int getVida(){
        return this.vida;
    }
    
    public int getAtaque(){
        return this.ataque;
    }
    
    public int getDefesa(){
        return this.defesa;
    }
    
    //Set
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setVida(int vida){
        this.vida = vida;
    }
    
    //Métodos que podem ser usados por um objeto do tipo pokemon    
    private void calculaAtributos(){
        switch(tipo){
            case "Fogo":
                vida = vida - 20;
                ataque = 50;
                defesa = 20;
            break;
            
            case "Agua":
                vida = vida - 5;
                ataque = 20;
                defesa = 35;
            break;
            
            case "Terra":
                vida = vida + 20;
                ataque = 15;
                defesa = 40;
            break;
            
            case "Ar":
                vida = vida + 25;
                ataque = 40;
                defesa = 20;
            break;
        }
    }
    
    private void calculaBonus(){
        
        vida = vida + (level / 2);
        ataque = ataque + (level / 3);
        defesa = defesa + (level / 4);
        
    }
    public void TakeDamage(int damage){
        vida = vida - damage;
        if(vida <= 0)
        {
          vida = 0;
        }
    }
       
    public void imprimiPokemon(){
        
        System.out.println("Pokémon Status: " +
                "Nome: " + nome + " | " + 
                    "Tipo: " + tipo + " | " + 
                        "Level: " + level + " | " + 
                            "Vida: " + vida + " | " +
                                "Ataque: " + ataque + " | " +
                                    "Defesa: " + defesa + "\n");
        
    }   
    
}