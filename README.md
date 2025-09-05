# Dosw-2-Laboratorio-3-E3

### Integrantes
- Daniel Palacios Moreno
- Marlio jose Charry Espitia
- Sofia Nicolle Ariza Goenaga

## Reto 1
** Desarrollo: **

**Reglas de Negocio:**
- El numero de cuenta debe tener 10 digitos
- Los dos primeros digitos del numero de cuenta deben corresponder a un banco registrado
- El numero de cuenta no puede tener letras o caracteres especiales
- El saldo de una cuenta no puede ser negativo

**Funcionalidades:**
- Crear una cuenta bancaria
- Validar cuenta bancaria
- Consultar saldo de una cuenta
- Hacer un deposito

**Actores**
- Usuario
- Bankify
- Bancos externos

**Precondiciones**
- Conocer el par de numeros que identifican cada banco
- Conocer bancos registrados y existentes
- Tener una base de datos disponible


# Reto 2
![img_1.png](docs/images/CasosUso.png)
![img.png](docs/images/contexto.png)
![img_2.png](docs/images/historiaUso.png)
![img_3.png](docs/images/atributosCalidad.png)
![img_4.png](docs/images/diagramaClases.png)

# Reto3

**•Evidencia de la implementación en código en el README.md**

- Evidencia del codigo

![img.png](docs/images/reto3Code.png)

- Ubicacion del codigo 

![img.png](docs/images/ubicacionReto3.png)

**•Patrones**

1. Un patron usado o pensado para ser usado es el de Factory method esto debido a que se planea usar al AccountManager como una especie de factory de cuentas que tambien puede administrarlas.
2. Un patron usado o pensado para ser usado es el de Observer esto para poder manejar notificaciones o actualizaciones en tiempo real por ejemplo el cambio en el balance se le podria notificar al usuario.
3. Un patron usado o pensado para ser usado es el de Singleton esto debido a que para las clases como AccountManager o Bankify se implementen como singletons para asegurar asi una unica instancia esto debido a que se encargan de gestionar globalmente el sistema. 

**•Captura de Pantalla de la Evidencia de las votaciones mostrando todos los casos**

# Primera parte de discusion tareas a realizar:

![img.png](docs/images/primeraParteReto3Ejecucion.png)

# Segunda parte de discusion tareas junto a los resultados obtenidos de las tareas a realizar:

![img.png](docs/images/segundaParteReto3Ejecucion.png)
