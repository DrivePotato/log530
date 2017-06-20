#include "libreria_energia.h"

#Funciones de conversion de Joule a otras unidades

def conversionJouleCaloria(self, numero):
    return numero*JOULE_CALORIA


def conversionJouleKCaloria(self, numero):
    return numero*JOULE_KCALORIA


def conversionJouleBTU(self, numero):
    return numero*JOULE_BTU


def conversionJouleKWHR(self, numero):
    return numero*JOULE_KWHR


def conversionJouleHPHR(self, numero):
    return numero*JOULE_HPHR


def conversionJoulePielb(self, numero):
    return numero*JOULE_PIELB
}    

def conversionJouleLitroAtm(self, numero):
    return numero*JOULE_LITROATM


#Tomando las funciones de conversion de Joule a otras unidades, las funciones inversas

def conversionCaloriaJoule(self, numero):
    return numero/JOULE_CALORIA


def conversionKCaloriaJoule(self, numero):
    return numero/JOULE_KCALORIA


def conversionBTUJoule(self, numero):
    return numero/JOULE_BTU


def conversionKWHRJoule(self, numero):
    return numero/JOULE_KWHR


def conversionHPHRJoule(self, numero):
    return numero/JOULE_HPHR


def conversionPielbJoule(self, numero):
    return numero/JOULE_PIELB
}    

def conversionLitroAtmJoule(self, numero):
    return numero/JOULE_LITROATM


#Funciones de conversión de Caloria a otras unidades, aquellas que envuelven Joules

def conversionCaloriaKCaloria(self, numero):
    return numero*CALORIA_KCALORIA


def conversionCaloriaBTU(self, numero):
    return numero*CALORIA_BTU


def conversionCaloriaKWHR(self, numero):
    return numero*CALORIA_KWHR


def conversionCaloriaHPHR(self, numero):
    return numero*CALORIA_HPHR


def conversionCaloriaPielb(self, numero):
    return numero*CALORIA_PIELB


def conversionCaloriaLitroAtm(self, numero):
    return numero*CALORIA_LITROATM


#Tomando las funciones de conversion de Caloria, las funciones inversas

def conversionKCaloriaCaloria(self, numero):
    return numero/CALORIA_KCALORIA


def conversionBTUCaloria(self, numero):
    return numero/CALORIA_BTU


def conversionKWHRCaloria(self, numero):
    return numero/CALORIA_KWHR


def conversionHPHRCaloria(self, numero):
    return numero/CALORIA_HPHR


def conversionPielbCaloria(self, numero):
    return numero/CALORIA_PIELB


def conversionLitroAtmCaloria(self, numero):
    return numero/CALORIA_LITROATM


#Funciones de conversion de Kcaloria a otras unidades, las funciones que contengan Joule y Caloria

def conversionKCaloriaBTU(self, numero):
    return numero*KCALORIA_BTU


def conversionKCaloriaKWHR(self, numero):
    return numero*KCALORIA_KWHR


def conversionKCaloriaHPHR(self, numero):
    return numero*KCALORIA_HPHR


def conversionKCaloriaPielb(self, numero):
    return numero*KCALORIA_PIELB


def conversionKCaloriaLitroAtm(self, numero):
    return numero*KCALORIA_LITROATM


#Tomando las funciones de conversion de KCaloria, las funciones inversas

def conversionBTUKCaloria(self, numero):
    return numero/KCALORIA_BTU


def conversionKWHRKCaloria(self, numero):
    return numero/KCALORIA_KWHR


def conversionHPHRKCaloria(self, numero):
    return numero/KCALORIA_HPHR


def conversionPielbKCaloria(self, numero):
    return numero/KCALORIA_PIELB


def conversionLitroAtmKCaloria(self, numero):
    return numero/KCALORIA_LITROATM


#Funciones de conversion de BTU a otras unidades, las funciones que contengan Joule, y KCaloria

def conversionBTUKWHR(self, numero):
    return numero*BTU_KWHR


def conversionBTUHPHR(self, numero):
    return numero*BTU_HPHR


def conversionBTUPielb(self, numero):
    return numero*BTU_PIELB


def conversionBTULitroAtm(self, numero):
    return numero*BTU_LITROATM


#Tomando las funciones de conversion de BTU, las funciones inversas

def conversionKWHRBTU(self, numero):
    return numero/BTU_KWHR


def conversionHPHRBTU(self, numero):
    return numero/BTU_HPHR


def conversionPielbBTU(self, numero):
    return numero/BTU_PIELB


def conversionLitroAtmBTU(self, numero):
    return numero/BTU_LITROATM


#Funciones de conversion de KWHR a otras unidades, las funciones que contengan Joule, Caloria, ni BTU

def conversionKWHRHPHR(self, numero):
    return numero*KWHR_HPHR


def conversionKWHRPielb(self, numero):
    return numero*KWHR_PIELB


def conversionKWHRLitroAtm(self, numero):
    return numero*KWHR_LITROATM


#Tomando las funciones de conversion de KWHR, las funciones inversas

def conversionHPHRKWHR(self, numero):
    return numero/KWHR_HPHR


def conversionPielbKWHR(self, numero):
    return numero/KWHR_PIELB


def conversionLitroAtmKWHR(self, numero):
    return numero/KWHR_LITROATM


#Funciones de conversion de HPHR a otras unidades, las funciones que contengan Joule, Caloria, KCaloria, ni KWHR

def conversionHPHRPielb(self, numero):
    return numero*HPHR_PIELB


def conversionHPHRLitroAtm(self, numero):
    return numero*HPHR_LITROATM


#Tomando las funciones de conversion de HPHR, las funciones inversas

def conversionPielbHPHR(self, numero):
    return numero/HPHR_PIELB


def conversionLitroAtmHPHR(self, numero):
    return numero/HPHR_LITROATM


#Funciones de conversion de LitroAtm a otras unidades, las funciones que contengan Joule, Caloria, KCaloria, BTU, ni HPHR

def conversionLitroAtmPielb(self, numero):
    return numero*LITROATM_PIELB


#Tomando las funciones de conversion de HPHR, las funciones inversas

def conversionPielbLitroAtm(self, numero):
    return numero*LITROATM_PIELB
