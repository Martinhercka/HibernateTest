package sk.akademiasovy.hibernate.entity;

import javax.persistence.*;


@Entity
@Table(name = "cars")
public class Cars
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "brand")
    private String brand;

    @Column(name = "engine")
    private double engine;

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getBrand()
    {
        return brand;
    }

    public void setBrand(String brand)
    {
        this.brand = brand;
    }

    public double getEngine()
    {
        return engine;
    }

    public void setEngine(double engine)
    {
        this.engine = engine;
    }
}
