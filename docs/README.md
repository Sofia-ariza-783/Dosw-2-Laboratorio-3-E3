## Cuestionario
1. **¿Cuál es la diferencia principal entre una prueba unitaria y una prueba de integración E2E?**

- Prueba unitaria: Verifica el funcionamiento de unidades individuales de código (métodos, clases) de forma aislada. Se centra en lógica interna y no depende de componentes externos.

- Prueba de integración E2E (End-to-End): Valida el flujo completo de la aplicación, simulando el comportamiento de un usuario real. Involucra múltiples componentes (base de datos, APIs, interfaz) trabajando together.

- Diferencia clave: Las unitarias son rápidas y aisladas; las E2E son lentas y cubren todo el sistema.

2. **En Scrum ¿Cuál es el propósito de la Sprint Retrospective y porque es crucial para la mejora continua del equipo?**

- Propósito: Identificar qué salió bien, qué puede mejorar y definir acciones concretas para aumentar la eficiencia del equipo en el siguiente sprint.

- Importancia: Fomenta la mejora continua al permitir que el equipo reflexione sobre su proceso, adaptándose a cambios y fortaleciendo la colaboración.

3. **Explique la diferencia entre una Épica, una Feature y una historia de Usuario. Proporcione un ejemplo de cada una si tenemos un sistema de streaming de video como lo es Netflix.**

- Épica: Conjunto grande de funcionalidades. Ej: "Mejorar la experiencia de recomendación de contenido".

- Feature: Parte de una épica que entrega valor tangible. Ej: "Añadir recomendaciones basadas en el historial de visualización".

- Historia de Usuario: Requisito específico desde la perspectiva del usuario. Ej: "Como usuario, quiero ver una lista de series sugeridas para maratón de fin de semana".

4. **¿Qué es una cobertura de Código (code coverage) y porque una cobertura del 100% no garantiza necesariamente que el software esté libre de errores?**

- Definición: Métrica que mide el porcentaje de código ejecutado durante las pruebas.

- Limitación del 100%: No garantiza calidad porque:

    - No prueba todos los escenarios posibles (ej: entradas inválidas)..
    - No valida lógica de negocio ni usabilidad.
    - Puede haber código ejecutado pero no probado adecuadamente.


5. **Describa que es un Diagrama de Casos de Uso y que elementos lo componen. ¿Para qué sirve en la fase de análisis de requerimientos?**

- Qué es: Representación visual de las interacciones entre usuarios (actores) y el sistema.

- Elementos:
    - Actores: Roles que interactúan con el sistema (ej: Usuario, Administrador).
    - Casos de Uso: Funcionalidades del sistema (ej: "Reproducir video").
    - Relaciones: Asociaciones entre actores y casos de uso.
    - Utilidad en análisis de requerimientos: Ayuda a identificar funcionalidades clave y comprender cómo los usuarios usarán el sistema.

6. **¿Cuál es la diferencia entre el uso de Junit y Jacoco en un proyecto, y como complementa SonarQube este proceso en términos de calidad de software?**

- JUnit: Framework para escribir y ejecutar pruebas unitarias.

- JaCoCo: Herramienta que mide la cobertura de código de las pruebas.

- SonarQube: Plataforma que analiza calidad del código (bugs, vulnerabilidades, deuda técnica) y integra métricas de cobertura.

- Complemento: JUnit ejecuta pruebas, JaCoCo mide cuánto código se prueba, y SonarQube evalúa calidad general.


7. **¿Qué ventajas tiene el uso de Planning Poker frente a otros métodos de estimación tradicional y como ayuda a mejorar la transparencia y compromiso del equipo?**

- Ventajas:

    - Fomenta la discusión colaborativa sobre complejidad de tareas.

    - Reduce sesgos (ej: dominación de voces fuertes) al usar estimaciones anónimas.

    - Mejora la transparencia y compromiso al involucrar a todo el equipo.

8. **Menciona los valores de Scrum y explica cual consideras más difícil de aplicar en un equipo.**

- Valores: Compromiso, Coraje, Foco, Apertura y Respeto.

- Más difícil de aplicar: Apertura, porque requiere que el equipo admita errores y discuta problemas abiertamente, lo que puede ser culturalmente desafiante en entornos jerárquicos o con poca confianza.
