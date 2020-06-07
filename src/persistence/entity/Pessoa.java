package persistence.entity;

@Entity
@Table(name = "pessoa")
public class Pessoa {
	
	@Id
    private int id;
    @Column
    private String nome;
     
    public int getId() {
              return id;
    }
    public void setId(int id) {
              this.id = id;
    }
    public String getNome() {
              return nome;
    }
    public void setNome(String nome) {
              this.nome = nome;
    }

}
