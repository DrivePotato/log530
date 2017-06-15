//Definiciones para Joule a otras unidades y funciones inversas

#define JOULE_CALORIA 0.23901
#define JOULE_KCALORIA 0.000239 //x10^-4
#define JOULE_BTU 0.00094782 //x10^-4
#define JOULE_KWHR 0.00027778 //x10^-4
#define JOULE_HPHR 0.00000037251 //x10^-7
#define JOULE_PIELB 0.73756
#define JOULE_LITROATM 0.0098692 //x10^-3

//Definiciones para Caloria a otras unidades y funciones inversas, sin Joule

#define CALORIA_KCALORIA 1000
#define CALORIA_BTU 0.00396 //x10^-3
#define CALORIA_KWHR 0.0000011622 //sx10^-6
#define CALORIA_HPHR 0.0000015586 //x10^-6
#define CALORIA_PIELB 3.0860
#define CALORIA_LITROATM 0.041293 //x10^-2

//Definiciones para KCaloria a otras unidades y funciones inversas, sin Joule ni Caloria

#define KCALORIA_BTU 3.9657
#define KCALORIA_KWHR 0.0011622 //x10^-3
#define KCALORIA_HPHR 0.0015586 //x10^-3
#define KCALORIA_PIELB 3086 
#define KCALORIA_LITROATM 4.253

//Definiciones para Joule a otras unidades y funciones inversas, sin Joule, Caloria ni KCaloria

#define BTU_KWHR 0.00029307 //x10^-4
#define BTU_HPHR 0.00039301 //x10^-4
#define BTU_PIELB 778.17
#define BTU_LITROATM 10.413

//Definiciones para KWHR a otras unidades y funciones inversas, sin Joule, Caloria, KCaloria ni BTU

#define KWHR_HPHR 1.3410
#define KWHR_PIELB 2655200 //x10^6
#define KWHR_LITROATM 0.035529 //x10^-2

//Definiciones para HPHR a otras unidades y funciones inversas, sin Joule, Caloria, KCaloria, BTU ni KWHR

#define HPHR_PIELB 1980000 //x10^6
#define HPHR_LITROATM 26494 //x10^4 

//Definiciones para LitroAtm a otras unidades y funciones inversas, sin Joule, Caloria, KCaloria, BTU, KWHR ni HPHR

#define LITROATM_PIELB 74.733

float conversionJouleCaloria(float numero);
float conversionJouleKCaloria(float numero);
float conversionJouleBTU(float numero);
float conversionJouleKWHR(float numero);
float conversionJouleHPHR(float numero);
float conversionJoulePielb(float numero);
float conversionJouleLitroAtm(float numero);
float conversionCaloriaJoule(float numero);
float conversionKCaloriaJoule(float numero);
float conversionBTUJoule(float numero);
float conversionKWHRJoule(float numero);
float conversionHPHRJoule(float numero);
float conversionPielbJoule(float numero);
float conversionLitroAtmJoule(float numero);
float conversionCaloriaKCaloria(float numero);
float conversionCaloriaBTU(float numero);
float conversionCaloriaKWHR(float numero);
float conversionCaloriaHPHR(float numero);
float conversionCaloriaPielb(float numero);
float conversionCaloriaLitroAtm(float numero);
float conversionKCaloriaCaloria(float numero);
float conversionBTUCaloria(float numero);
float conversionKWHRCaloria(float numero);
float conversionHPHRCaloria(float numero);
float conversionPielbCaloria(float numero);
float conversionLitroAtmCaloria(float numero);
float conversionKCaloriaBTU(float numero);
float conversionKCaloriaKWHR(float numero);
float conversionKCaloriaHPHR(float numero);
float conversionKCaloriaPielb(float numero);
float conversionKCaloriaLitroAtm(float numero);
float conversionBTUKCaloria(float numero);
float conversionKWHRKCaloria(float numero);
float conversionHPHRKCaloria(float numero);
float conversionPielbKCaloria(float numero);
float conversionLitroAtmKCaloria(float numero);
float conversionBTUKWHR(float numero);
float conversionBTUHPHR(float numero);
float conversionBTUPielb(float numero);
float conversionBTULitroAtm(float numero);
float conversionKWHRBTU(float numero);
float conversionHPHRBTU(float numero);
float conversionPielbBTU(float numero);
float conversionLitroAtmBTU(float numero);
float conversionKWHRHPHR(float numero);
float conversionKWHRPielb(float numero);
float conversionKWHRLitroAtm(float numero);
float conversionHPHRKWHR(float numero);
float conversionPielbKWHR(float numero);
float conversionLitroAtmKWHR(float numero);
float conversionHPHRPielb(float numero);
float conversionHPHRLitroAtm(float numero);
float conversionPielbHPHR(float numero);
float conversionLitroAtmHPHR(float numero);
float conversionLitroAtmPielb(float numero);
float conversionPielbLitroAtm(float numero);