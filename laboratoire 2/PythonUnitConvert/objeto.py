import libreria_energia as l
#Funciones de conversion de Joule a otras unidades

def conversionJouleCaloria(numero):
    return numero*l.JOULE_CALORIA


def conversionJouleKCaloria(numero):
    return numero*l.JOULE_KCALORIA


def conversionJouleBTU(numero):
    return numero*l.JOULE_BTU


def conversionJouleKWHR(numero):
    return numero*l.JOULE_KWHR


def conversionJouleHPHR(numero):
    return numero*l.JOULE_HPHR


def conversionJoulePielb(numero):
    return numero*l.JOULE_PIELB
   

def conversionJouleLitroAtm(numero):
    return numero*l.JOULE_LITROATM


#Tomando las funciones de conversion de Joule a otras unidades, las funciones inversas

def conversionCaloriaJoule(numero):
    return numero/l.JOULE_CALORIA


def conversionKCaloriaJoule(numero):
    return numero/l.JOULE_KCALORIA


def conversionBTUJoule(numero):
    return numero/l.JOULE_BTU


def conversionKWHRJoule(numero):
    return numero/l.JOULE_KWHR


def conversionHPHRJoule(numero):
    return numero/l.JOULE_HPHR


def conversionPielbJoule(numero):
    return numero/l.JOULE_PIELB
  

def conversionLitroAtmJoule(numero):
    return numero/l.JOULE_LITROATM


#Funciones de conversión de Caloria a otras unidades, aquellas que envuelven Joules

def conversionCaloriaKCaloria(numero):
    return numero*l.CALORIA_KCALORIA


def conversionCaloriaBTU(numero):
    return numero*l.CALORIA_BTU


def conversionCaloriaKWHR(numero):
    return numero*l.CALORIA_KWHR


def conversionCaloriaHPHR(numero):
    return numero*l.CALORIA_HPHR


def conversionCaloriaPielb(numero):
    return numero*l.CALORIA_PIELB


def conversionCaloriaLitroAtm(numero):
    return numero*l.CALORIA_LITROATM


#Tomando las funciones de conversion de Caloria, las funciones inversas

def conversionKCaloriaCaloria(numero):
    return numero/l.CALORIA_KCALORIA


def conversionBTUCaloria(numero):
    return numero/l.CALORIA_BTU


def conversionKWHRCaloria(numero):
    return numero/l.CALORIA_KWHR


def conversionHPHRCaloria(numero):
    return numero/l.CALORIA_HPHR


def conversionPielbCaloria(numero):
    return numero/l.CALORIA_PIELB


def conversionLitroAtmCaloria(numero):
    return numero/l.CALORIA_LITROATM


#Funciones de conversion de Kcaloria a otras unidades, las funciones que contengan Joule y Caloria

def conversionKCaloriaBTU(numero):
    return numero*l.KCALORIA_BTU


def conversionKCaloriaKWHR(numero):
    return numero*l.KCALORIA_KWHR


def conversionKCaloriaHPHR(numero):
    return numero*l.KCALORIA_HPHR


def conversionKCaloriaPielb(numero):
    return numero*l.KCALORIA_PIELB


def conversionKCaloriaLitroAtm(numero):
    return numero*l.KCALORIA_LITROATM


#Tomando las funciones de conversion de KCaloria, las funciones inversas

def conversionBTUKCaloria(numero):
    return numero/l.KCALORIA_BTU


def conversionKWHRKCaloria(numero):
    return numero/l.KCALORIA_KWHR


def conversionHPHRKCaloria(numero):
    return numero/l.KCALORIA_HPHR


def conversionPielbKCaloria(numero):
    return numero/l.KCALORIA_PIELB


def conversionLitroAtmKCaloria(numero):
    return numero/l.KCALORIA_LITROATM


#Funciones de conversion de BTU a otras unidades, las funciones que contengan Joule, y KCaloria

def conversionBTUKWHR(numero):
    return numero*l.BTU_KWHR


def conversionBTUHPHR(numero):
    return numero*l.BTU_HPHR


def conversionBTUPielb(numero):
    return numero*l.BTU_PIELB


def conversionBTULitroAtm(numero):
    return numero*l.BTU_LITROATM


#Tomando las funciones de conversion de BTU, las funciones inversas

def conversionKWHRBTU(numero):
    return numero/l.BTU_KWHR


def conversionHPHRBTU(numero):
    return numero/l.BTU_HPHR


def conversionPielbBTU(numero):
    return numero/l.BTU_PIELB


def conversionLitroAtmBTU(numero):
    return numero/l.BTU_LITROATM


#Funciones de conversion de KWHR a otras unidades, las funciones que contengan Joule, Caloria, ni BTU

def conversionKWHRHPHR(numero):
    return numero*l.KWHR_HPHR


def conversionKWHRPielb(numero):
    return numero*l.KWHR_PIELB


def conversionKWHRLitroAtm(numero):
    return numero*l.KWHR_LITROATM


#Tomando las funciones de conversion de KWHR, las funciones inversas

def conversionHPHRKWHR(numero):
    return numero/l.KWHR_HPHR


def conversionPielbKWHR(numero):
    return numero/l.KWHR_PIELB


def conversionLitroAtmKWHR(numero):
    return numero/l.KWHR_LITROATM


#Funciones de conversion de HPHR a otras unidades, las funciones que contengan Joule, Caloria, KCaloria, ni KWHR

def conversionHPHRPielb(numero):
    return numero*l.HPHR_PIELB


def conversionHPHRLitroAtm(numero):
    return numero*l.HPHR_LITROATM


#Tomando las funciones de conversion de HPHR, las funciones inversas

def conversionPielbHPHR(numero):
    return numero/l.HPHR_PIELB


def conversionLitroAtmHPHR(numero):
    return numero/l.HPHR_LITROATM


#Funciones de conversion de LitroAtm a otras unidades, las funciones que contengan Joule, Caloria, KCaloria, BTU, ni HPHR

def conversionLitroAtmPielb(numero):
    return numero*l.LITROATM_PIELB


#Tomando las funciones de conversion de HPHR, las funciones inversas

def conversionPielbLitroAtm(numero):
    return numero*l.LITROATM_PIELB
