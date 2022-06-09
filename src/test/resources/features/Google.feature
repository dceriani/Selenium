Feature: Probar la busqueda en Google

    Scenario Outline: Buscar algo en Google
        Given Navego a google
        When Ingreso criterio de busuqueda
        And Presionar el boton de buscar
        Then Obtengo resultado
        Examples: