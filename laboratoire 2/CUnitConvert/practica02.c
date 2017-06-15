#include <stdio.h>
#include "libreria_energia.h"

float menu_seleccion(void);
float menu_conversionJoule(void);
float menu_conversionCaloria(void);
float menu_conversionKCaloria(void);
float menu_conversionBTU(void);
float menu_conversionKWHR(void);
float menu_conversionHPHR(void);
float menu_conversionPielb(void);
float menu_conversionLitroAtm(void);

float resultado, numero;
int opcion;

float main(void)
{
    menu_seleccion(); 
}

float menu_seleccion(void)
{
    
    printf("\nEscriba la cantidad, después el número correspondiente a la unidad que quiere convertir");
    
    printf("\n1 -- Joule");
    printf("\n2 -- Caloría");
    printf("\n3 -- KCaloría");
    printf("\n4 -- BTU - British Thermal Unit");
    printf("\n5 -- KW-HR");
    printf("\n6 -- HP-HR");
    printf("\n7 -- Pie-Libra");
    printf("\n8 -- Litro-Atmosfera\n");  
    scanf("%f",&numero);
    scanf("%d",&opcion);
    printf("\n%f",numero);
    
    switch(opcion)
    {
        case 1:
        menu_conversionJoule();
        break;
        
        case 2:
        menu_conversionCaloria();
        break;
        
        case 3:
        menu_conversionKCaloria();
        break;
        
        case 4:
        menu_conversionBTU();
        break;
        
        case 5:
        menu_conversionKWHR();
        break;
        
        case 6:
        menu_conversionHPHR();
        break;
        
        case 7:
        menu_conversionPielb();
        break;
        
        case 8:
        menu_conversionLitroAtm();
        break;
    }
        
    printf ("El resultado es %f\n", resultado);
}

float menu_conversionJoule(void)
{
    
    printf("\n\nElija la unidad a la que desea convertir");
    
    printf("\n1 -- Caloría");
    printf("\n2 -- KCaloría");
    printf("\n3 -- BTU - British Thermal Unit");
    printf("\n4 -- KW-HR");
    printf("\n5 -- HP-HR");
    printf("\n6 -- Pie-Libra");
    printf("\n7 -- Litro-Atmosfera\n");
    
    scanf("%d",&opcion);
    
    switch(opcion)
    {
        case 1:
        conversionJouleCaloria(numero);
        break;
        
        case 2:
        conversionJouleKCaloria(numero);
        break;
        
        case 3:
        conversionJouleBTU(numero);
        break;
        
        case 4:
        conversionJouleKWHR(numero);
        break;
        
        case 5:
        conversionJouleHPHR(numero);
        break;
        
        case 6:
        conversionJoulePielb(numero);
        break;
        
        case 7:
        conversionJouleLitroAtm(numero);
        break;
        
        case 8:
        
        break;
    }
}

float menu_conversionCaloria(void)
{
    printf("Elija la unidad a la que desea convertir");
    printf("\n1 -- Joule");
    printf("\n2 -- KCaloría");
    printf("\n3 -- BTU - British Thermal Unit");
    printf("\n4 -- KW-HR");
    printf("\n5 -- HP-HR");
    printf("\n6 -- Pie-Libra");
    printf("\n7 -- Litro-Atmosfera\n");
    
    scanf("%d",&opcion);
    
    switch(opcion)
    {
        case 1:
        conversionCaloriaJoule(numero);
        break;
        
        case 2:
        conversionCaloriaKCaloria(numero);
        break;
        
        case 3:
        conversionCaloriaBTU(numero);
        break;
        
        case 4:
        conversionCaloriaKWHR(numero);
        break;
        
        case 5:
        conversionCaloriaHPHR(numero);
        break;
        
        case 6:
        conversionCaloriaPielb(numero);
        break;
        
        case 7:
        conversionCaloriaLitroAtm(numero);
        break;
        
        case 8:
        
        break;
    }
    return 0;
}

float menu_conversionKCaloria(void)
{
    printf("\n\nElija la unidad a la que desea convertir");
    printf("\n1 -- Joule");
    printf("\n2 -- Caloría");
    printf("\n3 -- BTU - British Thermal Unit");
    printf("\n4 -- KW-HR");
    printf("\n5 -- HP-HR");
    printf("\n6 -- Pie-Libra");
    printf("\n7 -- Litro-Atmosfera\n");
    
    scanf("%d",&opcion);
    
    switch(opcion)
    {
        case 1:
        conversionKCaloriaJoule(numero);
        break;
        
        case 2:
        conversionKCaloriaCaloria(numero);
        break;
        
        case 3:
        conversionKCaloriaBTU(numero);
        break;
        
        case 4:
        conversionKCaloriaKWHR(numero);
        break;
        
        case 5:
        conversionKCaloriaHPHR(numero);
        break;
        
        case 6:
        conversionKCaloriaPielb(numero);
        break;
        
        case 7:
        conversionKCaloriaLitroAtm(numero);
        break;
        
        case 8:
        
        break;
    }
    return 0;
}

float menu_conversionBTU(void)
{
    printf("\n\nElija la unidad a la que desea convertir");
    printf("\n1 -- Joule");
    printf("\n2 -- Caloría");
    printf("\n3 -- KCaloría");
    printf("\n4 -- KW-HR");
    printf("\n5 -- HP-HR");
    printf("\n6 -- Pie-Libra");
    printf("\n7 -- Litro-Atmosfera\n");
    
    scanf("%d",&opcion);
    
    switch(opcion)
    {
        case 1:
        conversionBTUJoule(numero);
        break;
        
        case 2:
        conversionBTUCaloria(numero);
        break;
        
        case 3:
        conversionBTUKCaloria(numero);
        break;
        
        case 4:
        conversionBTUKWHR(numero);
        break;
        
        case 5:
        conversionBTUHPHR(numero);
        break;
        
        case 6:
        conversionBTUPielb(numero);
        break;
        
        case 7:
        conversionBTULitroAtm(numero);
        break;
        
        case 8:
        
        break;
    }
    return 0;
}

float menu_conversionKWHR(void)
{
    printf("\n\nElija la unidad a la que desea convertir");
    printf("\n1 -- Joule");
    printf("\n2 -- Caloría");
    printf("\n3 -- KCaloría");
    printf("\n4 -- BTU - British Thermal Unit");
    printf("\n5 -- HP-HR");
    printf("\n6 -- Pie-Libra");
    printf("\n7 -- Litro-Atmosfera\n");
    
    scanf("%d",&opcion);
    
    switch(opcion)
    {
        case 1:
        conversionKWHRJoule(numero);
        break;
        
        case 2:
        conversionKWHRCaloria(numero);
        break;
        
        case 3:
        conversionKWHRKCaloria(numero);
        break;
        
        case 4:
        conversionKWHRBTU(numero);
        break;
        
        case 5:
        conversionKWHRHPHR(numero);
        break;
        
        case 6:
        conversionKWHRPielb(numero);
        break;
        
        case 7:
        conversionKWHRLitroAtm(numero);
        break;
        
        case 8:
        
        break;
    }
    return 0;
}

float menu_conversionHPHR(void)
{
    printf("\n\nElija la unidad a la que desea convertir");
    printf("\n1 -- Joule");
    printf("\n2 -- Caloría");
    printf("\n3 -- KCaloría");
    printf("\n4 -- BTU - British Thermal Unit");
    printf("\n5 -- KW-HR");
    printf("\n6 -- Pie-Libra");
    printf("\n7 -- Litro-Atmosfera\n");
    
    scanf("%d",&opcion);
    
    switch(opcion)
    {
        case 1:
        conversionHPHRJoule(numero);
        break;
        
        case 2:
        conversionHPHRCaloria(numero);
        break;
        
        case 3:
        conversionHPHRKCaloria(numero);
        break;
        
        case 4:
        conversionHPHRBTU(numero);
        break;
        
        case 5:
        conversionHPHRKWHR(numero);
        break;
        
        case 6:
        conversionHPHRPielb(numero);
        break;
        
        case 7:
        conversionHPHRLitroAtm(numero);
        break;
        
        case 8:
        
        break;
    }
    return 0;
}

float menu_conversionPielb(void)
{
    printf("\n\nElija la unidad a la que desea convertir");
    printf("\n1 -- Joule");
    printf("\n2 -- Caloría");
    printf("\n3 -- KCaloría");
    printf("\n4 -- BTU - British Thermal Unit");
    printf("\n5 -- KW-HR");
    printf("\n6 -- HP-HR");
    printf("\n7 -- Litro-Atmosfera\n");
    
    scanf("%d",&opcion);
    
    switch(opcion)
    {
        case 1:
        conversionPielbJoule(numero);
        break;
        
        case 2:
        conversionPielbCaloria(numero);
        break;
        
        case 3:
        conversionPielbKCaloria(numero);
        break;
        
        case 4:
        conversionPielbBTU(numero);
        break;
        
        case 5:
        conversionPielbKWHR(numero);
        break;
        
        case 6:
        conversionPielbHPHR(numero);
        break;
        
        case 7:
        conversionPielbLitroAtm(numero);
        break;
        
        case 8:
        
        break;
    }
    return 0;
}

float menu_conversionLitroAtm(void)
{
    printf("\n\nElija la unidad a la que desea convertir");
    printf("\n1 -- Joule");
    printf("\n2 -- Caloría");
    printf("\n3 -- KCaloría");
    printf("\n4 -- BTU - British Thermal Unit");
    printf("\n5 -- KW-HR");
    printf("\n6 -- HP-HR");
    printf("\n7 -- Pie-Libra\n");
    
    scanf("%d",&opcion);
    
    switch(opcion)
    {
        case 1:
        conversionLitroAtmJoule(numero);
        break;
        
        case 2:
        conversionLitroAtmCaloria(numero);
        break;
        
        case 3:
        conversionLitroAtmKCaloria(numero);
        break;
        
        case 4:
        conversionLitroAtmBTU(numero);
        break;
        
        case 5:
        conversionLitroAtmKWHR(numero);
        break;
        
        case 6:
        conversionLitroAtmHPHR(numero);
        break;
        
        case 7:
        conversionLitroAtmPielb(numero);
        break;
        
        case 8:
        
        break;
    }
}