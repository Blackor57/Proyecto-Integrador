package com.example.proyectointegrador.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Collection;
import java.util.List;

@Entity
@Table(name = "usuarios", uniqueConstraints = @UniqueConstraint(columnNames = "email"))
@NoArgsConstructor
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private long id;

    @Column(name = "nombre")
    @Getter
    @Setter
    private String nombre;

    @Column(name = "apellido")
    @Getter
    @Setter
    private String apellido;

    @Column(name = "email")
    @Getter
    @Setter
    private String email;

    @Column(name = "password")
    @Getter
    @Setter
    private String password;

    @Column(name = "phone")
    @Getter
    @Setter
    private String phone;

    @Column(name = "dni")
    @Getter
    @Setter
    private String dni;

    @Column(name = "birth_date")
    @Getter
    @Setter
    private LocalDate birthDate;

    @ManyToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @Getter
    @Setter
    @JoinTable(name = "usuarios_roles",
            joinColumns = @JoinColumn(name = "usuario_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "rol_id", referencedColumnName = "id"))
    private Collection<Rol> roles;

    @OneToMany(mappedBy = "usuario")
    @Getter
    @Setter
    private List<Producto> productos;

    @OneToMany(mappedBy = "usuario")
    @Getter
    @Setter
    private List<Orden> ordenes;

    @Column(nullable = false)
    @Getter
    @Setter
    private int estrellas = 0;

    public Usuario(long id, String nombre, String apellido, String email, String password, String phone, String dni, LocalDate birthDate, Collection<Rol> roles, List<Producto> productos, List<Orden> ordenes, int estrellas) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.password = password;
        this.phone = phone;
        this.dni = dni;
        this.birthDate = birthDate;
        this.roles = roles;
        this.productos = productos;
        this.ordenes = ordenes;
        this.estrellas = estrellas;
    }

    public Usuario(String nombre, String apellido, String email, String password, String phone, String dni, LocalDate birthDate, Collection<Rol> roles) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.password = password;
        this.phone = phone;
        this.dni = dni;
        this.birthDate = birthDate;
        this.roles = roles;
    }
}
