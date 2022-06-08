import java.io.Serializable;

public class Product implements Serializable {
    int id;
    String name;
    int gia;
    int amount;
    String describe;

    public Product() {
    }

    public Product(int id, String name, int gia, int amount, String describe) {
        this.id = id;
        this.name = name;
        this.gia = gia;
        this.amount = amount;
        this.describe = describe;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", gia=" + gia +" VND"+
                ", amount=" + amount +
                ", describe='" + describe + '\'' +
                '}';
    }
}

