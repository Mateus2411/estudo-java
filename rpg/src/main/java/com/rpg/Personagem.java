package com.rpg;

public class Personagem {

    private String nome;
    private String sexo;
    private int experiencia;
    private int vida;
    private int ataque;
    private int defesa;
    private int nivel;
    private int mana;
    private int skillpoints;
    private String classe;

    public Personagem(String nome, String sexo, String classe, int vida, int skillpoints, int ataque, int experiencia) {
        this.nome = nome;
        this.sexo = sexo;
        this.classe = classe;
        this.vida = 100;
        this.skillpoints = 0; // Valor inicial para skillpoints
        this.ataque = 10; // Valor padrão para ataque
        this.experiencia = 0; // Valor inicial para experiência
        this.defesa = 10; // Valor padrão para defesa
        this.nivel = 0; // Valor padrão para nível
        this.mana = 100; // Valor padrão para mana
    }

    public String getNome() {
        return nome;
    }

    public int getVida() {
        return vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public int getDefesa() {
        return defesa;
    }

    public int getNivel() {
        return nivel;
    }

    public int getMana() {
        return mana;
    }

    public int getSkillpoints() {
        return skillpoints;
    }

    public String getSexo() {
        return sexo;
    }

    public String getClasse() {
        return classe;
    }

    // Presets quando a classe é escolhida
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    // Incrementar experiência, nível e skillpoints
    public void incrementarExperiencia(int experiencia) {
        this.experiencia += experiencia;
        if (this.experiencia >= 100) { // Exemplo de condição para subir de nível
            this.experiencia -= 100; // Reduz a experiência necessária para o próximo nível
            incrementarNivel(); // Incrementa o nível
            incrementarSkillpoints(); // Incrementa skillpoints ao subir de nível
        }
    }

    public void incrementarNivel() {
        this.nivel += 1;
    }

    public void incrementarSkillpoints() {
        this.skillpoints += 1;
    }

    public void incrementarStatusAoSubirNivel() {
        String classe = getClasse();
        switch (classe) {
            case "Guerreiro":
                this.ataque += 5;
                this.defesa += 5;
                break;
            case "Mago":
                this.mana += 20;
                this.ataque += 10;
                break;
            case "Arqueiro":
                this.ataque += 7;
                this.defesa += 3;
                break;
            default:
                throw new AssertionError();
        }
    }

    //Ações de ataque, defesa e uso de mana
    public void atacar(String personagem, String alvo) {
        
    }

    // All infos
    public String getInfos() {
        return "Nome: " + nome + "\n"
                + "Sexo: " + sexo + "\n"
                + "Classe: " + classe + "\n"
                + "Vida: " + vida + "\n"
                + "Ataque: " + ataque + "\n"
                + "Defesa: " + defesa + "\n"
                + "Mana: " + mana + "\n"
                + "Nível: " + nivel + "\n"
                + "Experiência: " + experiencia + "\n"
                + "Skillpoints: " + skillpoints;
    }
}
