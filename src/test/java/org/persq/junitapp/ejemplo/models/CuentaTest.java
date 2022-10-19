package org.persq.junitapp.ejemplo.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CuentaTest {
    Cuenta cuenta;

    @Test
    void testNombreCuenta(){
        cuenta = new Cuenta();
        cuenta.setPersona("Andres");
        String esperado = "Andres";
        assertEquals(esperado, cuenta.getPersona());
    }
}