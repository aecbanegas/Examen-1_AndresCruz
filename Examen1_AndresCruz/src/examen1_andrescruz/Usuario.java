/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1_andrescruz;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author MBanegas
 */
public class Usuario {
    String nom_usu;
    String contra;
    Date nacimiento;
    long telefono;
    String correo;
    String nombre;
    String genero;
    ArrayList<Libro>lista_libros=new ArrayList();
    ArrayList<Usuario>lista_amigos=new ArrayList();

    public Usuario(String nom_usu, String contra) {
        this.nom_usu = nom_usu;
        this.contra = contra;
    }

    public Usuario(String nom_usu, String contra, Date nacimiento, long telefono, String correo, String nombre, String genero) {
        this.nom_usu = nom_usu;
        this.contra = contra;
        this.nacimiento = nacimiento;
        this.telefono = telefono;
        this.correo = correo;
        this.nombre = nombre;
        this.genero = genero;
    }

    public String getNom_usu() {
        return nom_usu;
    }

    public void setNom_usu(String nom_usu) {
        this.nom_usu = nom_usu;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefon(long telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public ArrayList<Libro> getLista_libros() {
        return lista_libros;
    }

    public void setLista_libros(ArrayList<Libro> lista_libros) {
        this.lista_libros = lista_libros;
    }

    public ArrayList<Usuario> getLista_amigos() {
        return lista_amigos;
    }

    public void setLista_amigos(ArrayList<Usuario> lista_amigos) {
        this.lista_amigos = lista_amigos;
    }

    
    @Override
    public String toString() {
        return nom_usu;
    }

    
}
