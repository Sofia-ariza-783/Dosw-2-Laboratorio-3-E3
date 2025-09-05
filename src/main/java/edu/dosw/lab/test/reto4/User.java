package edu.dosw.lab.test.reto4;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;

/**
 * Clase que representa a un usuario dentro del sistema bancario.
 * Cada usuario tiene un identificador único y puede tener múltiples cuentas asociadas.
 */
public class User {
    private String id;
    private Map<String, Account> accounts;

    /**
     * Constructor que genera un nuevo usuario con un ID aleatorio de 8 dígitos
     * y una colección vacía de cuentas.
     */
    public User() {
        id = id = new Random()
                .ints(8, 0, 10)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining());
        accounts = new HashMap<>();
    }

    /**
     * Retorna el identificador único del usuario.
     *
     * @return ID del usuario.
     */
    public String getId() {
        return id;
    }

    /**
     * Asocia una nueva cuenta al usuario.
     *
     * @param account Cuenta que se desea vincular al usuario.
     */
    public void addAccount(Account account) {
        accounts.put(account.getId(), account);
    }
}
