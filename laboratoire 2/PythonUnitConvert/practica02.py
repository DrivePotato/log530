#include <stdio.h>
#include "libreria_energia.h"

import libreria_energia
import objeto as o

resultado=0.00000001
numero=0.0000001
opcion=0

def main():
    menu_seleccion(); 


def menu_seleccion():
    
    print("\nEscriba la cantidad, el numero correspondiente a la unidad que quiere convertir")
    
    print("\n1 -- Joule")
    print("\n2 -- Caloría")
    print("\n3 -- KCaloría")
    print("\n4 -- BTU - British Thermal Unit")
    print("\n5 -- KW-HR")
    print("\n6 -- HP-HR")
    print("\n7 -- Pie-Libra")
    print("\n8 -- Litro-Atmosfera\n");  
    
    print(numero)
    opcion=int(input("option? "))
    print("\n%f",numero)
    switch_dict = {
            1:menu_conversionJoule,
            2:menu_conversionCaloria,
            3:menu_conversionKCaloria,
            4:menu_conversionBTU,
            5:menu_conversionKWHR,
            6:menu_conversionHPHR,
            7:menu_conversionPielb,
            8:menu_conversionLitroAtm,
            }
    resultado=switch_dict[opcion]()
        
    print("El resultado es " + str(resultado))
    return


def menu_conversionJoule():
    
    print("\n\nElija la unidad a la que desea convertir")
    
    print("\n1 -- Caloría")
    print("\n2 -- KCaloría")
    print("\n3 -- BTU - British Thermal Unit")
    print("\n4 -- KW-HR")
    print("\n5 -- HP-HR")
    print("\n6 -- Pie-Libra")
    print("\n7 -- Litro-Atmosfera\n")
    
    opcion=int(input("option? "))
    switch_dict = {
            1:o.conversionJouleCaloria,
            2:o.conversionJouleKCaloria,
            3:o.conversionJouleBTU,
            4:o.conversionJouleKWHR,
            5:o.conversionJouleHPHR,
            6:o.conversionJoulePielb,
            7:o.conversionJouleLitroAtm,
            }
    numero=int(input("numero? "))
    return switch_dict[opcion](numero)




def menu_conversionCaloria():
    print("Elija la unidad a la que desea convertir")
    print("\n1 -- Joule")
    print("\n2 -- KCaloría")
    print("\n3 -- BTU - British Thermal Unit")
    print("\n4 -- KW-HR")
    print("\n5 -- HP-HR")
    print("\n6 -- Pie-Libra")
    print("\n7 -- Litro-Atmosfera\n")
    
    opcion=int(input("option? "))
    numero=int(input("numero? "))
    switch_dict = {
            1:o.conversionCaloriaJoule,
            2:o.conversionCaloriaKCaloria,
            3:o.conversionCaloriaBTU,
            4:o.conversionCaloriaKWHR,
            5:o.conversionCaloriaHPHR,
            6:o.conversionCaloriaPielb,
            7:o.conversionCaloriaLitroAtm,
            }
    numero=int(input("numero? "))
    return switch_dict[opcion](numero)    



def menu_conversionKCaloria():
    print("\n\nElija la unidad a la que desea convertir")
    print("\n1 -- Joule")
    print("\n2 -- Caloría")
    print("\n3 -- BTU - British Thermal Unit")
    print("\n4 -- KW-HR")
    print("\n5 -- HP-HR")
    print("\n6 -- Pie-Libra")
    print("\n7 -- Litro-Atmosfera\n")
    
    opcion=int(input("option? "))

    switch_dict = {
            1:o.conversionKCaloriaJoule,
            2:o.conversionKCaloriaCaloria,
            3:o.conversionKCaloriaBTU,
            4:o.conversionKCaloriaKWHR,
            5:o.conversionKCaloriaHPHR,
            6:o.conversionKCaloriaPielb,
            7:o.conversionKCaloriaLitroAtm,
            }
    numero=int(input("numero? "))
    return switch_dict[opcion](numero) 



def menu_conversionBTU():
    print("\n\nElija la unidad a la que desea convertir")
    print("\n1 -- Joule")
    print("\n2 -- Caloría")
    print("\n3 -- KCaloría")
    print("\n4 -- KW-HR")
    print("\n5 -- HP-HR")
    print("\n6 -- Pie-Libra")
    print("\n7 -- Litro-Atmosfera\n")

    opcion=int(input("option? "))

    switch_dict = {
            1:o.conversionBTUJoule,
            2:o.conversionBTUCaloria,
            3:o.conversionBTUKCaloria,
            4:o.conversionBTUKWHR,
            5:o.conversionBTUHPHR,
            6:o.conversionBTUPielb,
            7:o.conversionBTULitroAtm,
            }
    numero=int(input("numero? "))
    return switch_dict[opcion](numero)     



def menu_conversionKWHR():
    print("\n\nElija la unidad a la que desea convertir")
    print("\n1 -- Joule")
    print("\n2 -- Caloría")
    print("\n3 -- KCaloría")
    print("\n4 -- BTU - British Thermal Unit")
    print("\n5 -- HP-HR")
    print("\n6 -- Pie-Libra")
    print("\n7 -- Litro-Atmosfera\n")

    opcion=int(input("option? "))

    switch_dict = {
            1:o.conversionKWHRJoule,
            2:o.conversionKWHRCaloria,
            3:o.conversionKWHRKCaloria,
            4:o.conversionKWHRBTU,
            5:o.conversionKWHRHPHR,
            6:o.conversionKWHRPielb,
            7:o.conversionKWHRLitroAtm,
            }
    numero=int(input("numero? "))
    return switch_dict[opcion](numero)  



def menu_conversionHPHR():
    print("\n\nElija la unidad a la que desea convertir")
    print("\n1 -- Joule")
    print("\n2 -- Caloría")
    print("\n3 -- KCaloría")
    print("\n4 -- BTU - British Thermal Unit")
    print("\n5 -- KW-HR")
    print("\n6 -- Pie-Libra")
    print("\n7 -- Litro-Atmosfera\n")
 
    opcion=int(input("option? "))

    switch_dict = {
            1:o.conversionHPHRJoule,
            2:o.conversionHPHRCaloria,
            3:o.conversionHPHRKCaloria,
            4:o.conversionHPHRBTU,
            5:o.conversionHPHRKWHR,
            6:o.conversionHPHRPielb,
            7:o.conversionHPHRLitroAtm,
            }
    numero=int(input("numero? "))
    return switch_dict[opcion](numero)  



def menu_conversionPielb():
    print("\n\nElija la unidad a la que desea convertir")
    print("\n1 -- Joule")
    print("\n2 -- Caloría")
    print("\n3 -- KCaloría")
    print("\n4 -- BTU - British Thermal Unit")
    print("\n5 -- KW-HR")
    print("\n6 -- HP-HR")
    print("\n7 -- Litro-Atmosfera\n")

    opcion=int(input("option? "))

    switch_dict = {
            1:o.conversionPielbJoule,
            2:o.conversionPielbCaloria,
            3:o.conversionPielbKCaloria,
            4:o.conversionPielbBTU,
            5:o.conversionPielbKWHR,
            6:o.conversionPielbHPHR,
            7:o.conversionPielbLitroAtm,
            }
    numero=int(input("numero? "))
    return switch_dict[opcion](numero)  


def menu_conversionLitroAtm():
    print("\n\nElija la unidad a la que desea convertir")
    print("\n1 -- Joule")
    print("\n2 -- Caloría")
    print("\n3 -- KCaloría")
    print("\n4 -- BTU - British Thermal Unit")
    print("\n5 -- KW-HR")
    print("\n6 -- HP-HR")
    print("\n7 -- Pie-Libra\n")


    opcion=int(input("option? "))

    switch_dict = {
            1:o.conversionLitroAtmJoule,
            2:o.conversionLitroAtmCaloria,
            3:o.conversionLitroAtmKCaloria,
            4:o.conversionLitroAtmBTU,
            5:o.conversionLitroAtmKWHR,
            6:o.conversionLitroAtmHPHR,
            7:o.conversionLitroAtmPielb,
            }
    numero=int(input("numero? "))
    return switch_dict[opcion](numero)  


main()
