package nfsetimbo.capivaratech.model;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Entity
@Data
public class User implements Serializable {

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", cnpj=" + cnpj +
                ", nameCorporateReason='" + nameCorporateReason + '\'' +
                ", email='" + email + '\'' +
                ", publicPlace='" + publicPlace + '\'' +
                ", numberHome=" + numberHome +
                ", apartment=" + apartment +
                ", neighborhood='" + neighborhood + '\'' +
                ", city='" + city + '\'' +
                ", cep='" + cep + '\'' +
                ", businessPhone=" + businessPhone +
                ", homePhone=" + homePhone +
                '}';
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false,  updatable = false)
    private Long id;

    private double cnpj;

    private String nameCorporateReason;

    private String email;

    private String publicPlace;

    private double numberHome;

    private double apartment;

    private String neighborhood;

    private String city;

    private String cep;

    private double businessPhone;

    private double homePhone;

    @Column(nullable = false, updatable = false)
    private String UserCode;
}
