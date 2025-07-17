# Conceptos Básicos de Herencia en POO

## 1: ¿Qué es la herencia en POO y para qué se utiliza?

La herencia es como cuando heredas rasgos de tus padres. En programación, es un mecanismo que permite que una clase (llamada "hija") herede atributos y comportamientos de otra clase (llamada "padre").

### En palabras simples:

Imagina que tienes una clase `Animal` que tiene propiedades como `nombre` y `edad`, y métodos como `comer()` y `dormir()`. Luego puedes crear una clase `Perro` que herede de `Animal` y automáticamente tendrá esas mismas propiedades y métodos, además de poder agregar otros específicos como `ladrar()`.

### ¿Para qué sirve?

- **Reutilizar código**: Evitas escribir el mismo código una y otra vez.
- **Organización**: Crea una jerarquía clara y lógica entre clases.
- **Mantenimiento**: Si necesitas hacer un cambio, lo haces en un solo lugar.

### En Java se implementa así:

```java
// Clase padre
public class Animal {
    String nombre;
    int edad;

    public void comer() {
        System.out.println("Estoy comiendo");
    }
}

// Clase hija que hereda de Animal
public class Perro extends Animal {
    // Hereda nombre, edad y el método comer()
    public void ladrar() {
        System.out.println("¡Guau!");
    }
}
```

## 2: ¿Cómo se llaman las clases que heredan y las que son heredadas?

- **Clase padre (o superclase)**: Es la clase que da sus atributos y métodos a otra clase. En nuestro ejemplo, `Animal` es la clase padre.
- **Clase hija (o subclase)**: Es la clase que recibe los atributos y métodos de la clase padre. En el ejemplo, `Perro` es la clase hija.

### Relación en código:

```java
// Clase padre/superclase
public class Vehiculo {
    // atributos y métodos comunes a todos los vehículos
}

// Clase hija/subclase
public class Auto extends Vehiculo {
    // atributos y métodos específicos de Auto
}
```
