#include "libreria_energia.h"

//Funciones de conversion de Joule a otras unidades

float conversionJouleCaloria(float numero)
{
    return numero*JOULE_CALORIA;
}

float conversionJouleKCaloria(float numero)
{
    return numero*JOULE_KCALORIA;
}

float conversionJouleBTU(float numero)
{
    return numero*JOULE_BTU;
}

float conversionJouleKWHR(float numero)
{
    return numero*JOULE_KWHR;
}

float conversionJouleHPHR(float numero)
{
    return numero*JOULE_HPHR;
}

float conversionJoulePielb(float numero)
{
    return numero*JOULE_PIELB;
}    

float conversionJouleLitroAtm(float numero)
{
    return numero*JOULE_LITROATM;
}

//Tomando las funciones de conversion de Joule a otras unidades, hacemos las funciones inversas

float conversionCaloriaJoule(float numero)
{
    return numero/JOULE_CALORIA;
}

float conversionKCaloriaJoule(float numero)
{
    return numero/JOULE_KCALORIA;
}

float conversionBTUJoule(float numero)
{
    return numero/JOULE_BTU;
}

float conversionKWHRJoule(float numero)
{
    return numero/JOULE_KWHR;
}

float conversionHPHRJoule(float numero)
{
    return numero/JOULE_HPHR;
}

float conversionPielbJoule(float numero)
{
    return numero/JOULE_PIELB;
}    

float conversionLitroAtmJoule(float numero)
{
    return numero/JOULE_LITROATM;
}

//Funciones de conversión de Caloria a otras unidades, descontando aquellas que envuelven Joules

float conversionCaloriaKCaloria(float numero)
{
    return numero*CALORIA_KCALORIA;
}

float conversionCaloriaBTU(float numero)
{
    return numero*CALORIA_BTU;
}

float conversionCaloriaKWHR(float numero)
{
    return numero*CALORIA_KWHR;
}

float conversionCaloriaHPHR(float numero)
{
    return numero*CALORIA_HPHR;
}

float conversionCaloriaPielb(float numero)
{
    return numero*CALORIA_PIELB;
}

float conversionCaloriaLitroAtm(float numero)
{
    return numero*CALORIA_LITROATM;
}

//Tomando las funciones de conversion de Caloria, hacemos las funciones inversas

float conversionKCaloriaCaloria(float numero)
{
    return numero/CALORIA_KCALORIA;
}

float conversionBTUCaloria(float numero)
{
    return numero/CALORIA_BTU;
}

float conversionKWHRCaloria(float numero)
{
    return numero/CALORIA_KWHR;
}

float conversionHPHRCaloria(float numero)
{
    return numero/CALORIA_HPHR;
}

float conversionPielbCaloria(float numero)
{
    return numero/CALORIA_PIELB;
}

float conversionLitroAtmCaloria(float numero)
{
    return numero/CALORIA_LITROATM;
}

//Funciones de conversion de Kcaloria a otras unidades, menos las funciones que contengan Joule y Caloria

float conversionKCaloriaBTU(float numero)
{
    return numero*KCALORIA_BTU;
}

float conversionKCaloriaKWHR(float numero)
{
    return numero*KCALORIA_KWHR;
}

float conversionKCaloriaHPHR(float numero)
{
    return numero*KCALORIA_HPHR;
}

float conversionKCaloriaPielb(float numero)
{
    return numero*KCALORIA_PIELB;
}

float conversionKCaloriaLitroAtm(float numero)
{
    return numero*KCALORIA_LITROATM;
}

//Tomando las funciones de conversion de KCaloria, hacemos las funciones inversas

float conversionBTUKCaloria(float numero)
{
    return numero/KCALORIA_BTU;
}

float conversionKWHRKCaloria(float numero)
{
    return numero/KCALORIA_KWHR;
}

float conversionHPHRKCaloria(float numero)
{
    return numero/KCALORIA_HPHR;
}

float conversionPielbKCaloria(float numero)
{
    return numero/KCALORIA_PIELB;
}

float conversionLitroAtmKCaloria(float numero)
{
    return numero/KCALORIA_LITROATM;
}

//Funciones de conversion de BTU a otras unidades, menos las funciones que contengan Joule, Caloria y KCaloria

float conversionBTUKWHR(float numero)
{
    return numero*BTU_KWHR;
}

float conversionBTUHPHR(float numero)
{
    return numero*BTU_HPHR;
}

float conversionBTUPielb(float numero)
{
    return numero*BTU_PIELB;
}

float conversionBTULitroAtm(float numero)
{
    return numero*BTU_LITROATM;
}

//Tomando las funciones de conversion de BTU, hacemos las funciones inversas

float conversionKWHRBTU(float numero)
{
    return numero/BTU_KWHR;
}

float conversionHPHRBTU(float numero)
{
    return numero/BTU_HPHR;
}

float conversionPielbBTU(float numero)
{
    return numero/BTU_PIELB;
}

float conversionLitroAtmBTU(float numero)
{
    return numero/BTU_LITROATM;
}

//Funciones de conversion de KWHR a otras unidades, menos las funciones que contengan Joule, Caloria, KCaloria ni BTU

float conversionKWHRHPHR(float numero)
{
    return numero*KWHR_HPHR;
}

float conversionKWHRPielb(float numero)
{
    return numero*KWHR_PIELB;
}

float conversionKWHRLitroAtm(float numero)
{
    return numero*KWHR_LITROATM;
}

//Tomando las funciones de conversion de KWHR, hacemos las funciones inversas

float conversionHPHRKWHR(float numero)
{
    return numero/KWHR_HPHR;
}

float conversionPielbKWHR(float numero)
{
    return numero/KWHR_PIELB;
}

float conversionLitroAtmKWHR(float numero)
{
    return numero/KWHR_LITROATM;
}

//Funciones de conversion de HPHR a otras unidades, menos las funciones que contengan Joule, Caloria, KCaloria, BTU ni KWHR

float conversionHPHRPielb(float numero)
{
    return numero*HPHR_PIELB;
}

float conversionHPHRLitroAtm(float numero)
{
    return numero*HPHR_LITROATM;
}

//Tomando las funciones de conversion de HPHR, hacemos las funciones inversas

float conversionPielbHPHR(float numero)
{
    return numero/HPHR_PIELB;
}

float conversionLitroAtmHPHR(float numero)
{
    return numero/HPHR_LITROATM;
}

//Funciones de conversion de LitroAtm a otras unidades, menos las funciones que contengan Joule, Caloria, KCaloria, BTU, KWHR ni HPHR

float conversionLitroAtmPielb(float numero)
{
    return numero*LITROATM_PIELB;
}

//Tomando las funciones de conversion de HPHR, hacemos las funciones inversas

float conversionPielbLitroAtm(float numero)
{
    return numero*LITROATM_PIELB;
}