public class GlobalMembers
{
	//Funciones de conversion de Joule a otras unidades

	public static float conversionJouleCaloria(float numero)
	{
		return (float) (numero * DefineConstants.JOULE_CALORIA);
	}

	public static float conversionJouleKCaloria(float numero)
	{
		return (float) (numero * DefineConstants.JOULE_KCALORIA);
	}

	public static float conversionJouleBTU(float numero)
	{
		return (float) (numero * DefineConstants.JOULE_BTU);
	}

	public static float conversionJouleKWHR(float numero)
	{
		return (float) (numero * DefineConstants.JOULE_KWHR);
	}

	public static float conversionJouleHPHR(float numero)
	{
		return (float) (numero * DefineConstants.JOULE_HPHR);
	}

	public static float conversionJoulePielb(float numero)
	{
		return (float) (numero * DefineConstants.JOULE_PIELB);
	}

	public static float conversionJouleLitroAtm(float numero)
	{
		return (float) (numero * DefineConstants.JOULE_LITROATM);
	}

	//Tomando las funciones de conversion de Joule a otras unidades, hacemos las funciones inversas

	public static float conversionCaloriaJoule(float numero)
	{
		return (float) (numero / DefineConstants.JOULE_CALORIA);
	}

	public static float conversionKCaloriaJoule(float numero)
	{
		return (float) (numero / DefineConstants.JOULE_KCALORIA);
	}

	public static float conversionBTUJoule(float numero)
	{
		return (float) (numero / DefineConstants.JOULE_BTU);
	}

	public static float conversionKWHRJoule(float numero)
	{
		return (float) (numero / DefineConstants.JOULE_KWHR);
	}

	public static float conversionHPHRJoule(float numero)
	{
		return (float) (numero / DefineConstants.JOULE_HPHR);
	}

	public static float conversionPielbJoule(float numero)
	{
		return (float) (numero / DefineConstants.JOULE_PIELB);
	}

	public static float conversionLitroAtmJoule(float numero)
	{
		return (float) (numero / DefineConstants.JOULE_LITROATM);
	}

	//Funciones de conversión de Caloria a otras unidades, descontando aquellas que envuelven Joules

	public static float conversionCaloriaKCaloria(float numero)
	{
		return numero * DefineConstants.CALORIA_KCALORIA;
	}

	public static float conversionCaloriaBTU(float numero)
	{
		return (float) (numero * DefineConstants.CALORIA_BTU);
	}

	public static float conversionCaloriaKWHR(float numero)
	{
		return (float) (numero * DefineConstants.CALORIA_KWHR);
	}

	public static float conversionCaloriaHPHR(float numero)
	{
		return (float) (numero * DefineConstants.CALORIA_HPHR);
	}

	public static float conversionCaloriaPielb(float numero)
	{
		return (float) (numero * DefineConstants.CALORIA_PIELB);
	}

	public static float conversionCaloriaLitroAtm(float numero)
	{
		return (float) (numero * DefineConstants.CALORIA_LITROATM);
	}

	//Tomando las funciones de conversion de Caloria, hacemos las funciones inversas

	public static float conversionKCaloriaCaloria(float numero)
	{
		return numero / DefineConstants.CALORIA_KCALORIA;
	}

	public static float conversionBTUCaloria(float numero)
	{
		return (float) (numero / DefineConstants.CALORIA_BTU);
	}

	public static float conversionKWHRCaloria(float numero)
	{
		return (float) (numero / DefineConstants.CALORIA_KWHR);
	}

	public static float conversionHPHRCaloria(float numero)
	{
		return (float) (numero / DefineConstants.CALORIA_HPHR);
	}

	public static float conversionPielbCaloria(float numero)
	{
		return (float) (numero / DefineConstants.CALORIA_PIELB);
	}

	public static float conversionLitroAtmCaloria(float numero)
	{
		return (float) (numero / DefineConstants.CALORIA_LITROATM);
	}

	//Funciones de conversion de Kcaloria a otras unidades, menos las funciones que contengan Joule y Caloria

	public static float conversionKCaloriaBTU(float numero)
	{
		return (float) (numero * DefineConstants.KCALORIA_BTU);
	}

	public static float conversionKCaloriaKWHR(float numero)
	{
		return (float) (numero * DefineConstants.KCALORIA_KWHR);
	}

	public static float conversionKCaloriaHPHR(float numero)
	{
		return (float) (numero * DefineConstants.KCALORIA_HPHR);
	}

	public static float conversionKCaloriaPielb(float numero)
	{
		return numero * DefineConstants.KCALORIA_PIELB;
	}

	public static float conversionKCaloriaLitroAtm(float numero)
	{
		return (float) (numero * DefineConstants.KCALORIA_LITROATM);
	}

	//Tomando las funciones de conversion de KCaloria, hacemos las funciones inversas

	public static float conversionBTUKCaloria(float numero)
	{
		return (float) (numero / DefineConstants.KCALORIA_BTU);
	}

	public static float conversionKWHRKCaloria(float numero)
	{
		return (float) (numero / DefineConstants.KCALORIA_KWHR);
	}

	public static float conversionHPHRKCaloria(float numero)
	{
		return (float) (numero / DefineConstants.KCALORIA_HPHR);
	}

	public static float conversionPielbKCaloria(float numero)
	{
		return numero / DefineConstants.KCALORIA_PIELB;
	}

	public static float conversionLitroAtmKCaloria(float numero)
	{
		return (float) (numero / DefineConstants.KCALORIA_LITROATM);
	}

	//Funciones de conversion de BTU a otras unidades, menos las funciones que contengan Joule, Caloria y KCaloria

	public static float conversionBTUKWHR(float numero)
	{
		return (float) (numero * DefineConstants.BTU_KWHR);
	}

	public static float conversionBTUHPHR(float numero)
	{
		return (float) (numero * DefineConstants.BTU_HPHR);
	}

	public static float conversionBTUPielb(float numero)
	{
		return (float) (numero * DefineConstants.BTU_PIELB);
	}

	public static float conversionBTULitroAtm(float numero)
	{
		return (float) (numero * DefineConstants.BTU_LITROATM);
	}

	//Tomando las funciones de conversion de BTU, hacemos las funciones inversas

	public static float conversionKWHRBTU(float numero)
	{
		return (float) (numero / DefineConstants.BTU_KWHR);
	}

	public static float conversionHPHRBTU(float numero)
	{
		return (float) (numero / DefineConstants.BTU_HPHR);
	}

	public static float conversionPielbBTU(float numero)
	{
		return (float) (numero / DefineConstants.BTU_PIELB);
	}

	public static float conversionLitroAtmBTU(float numero)
	{
		return (float) (numero / DefineConstants.BTU_LITROATM);
	}

	//Funciones de conversion de KWHR a otras unidades, menos las funciones que contengan Joule, Caloria, KCaloria ni BTU

	public static float conversionKWHRHPHR(float numero)
	{
		return (float) (numero * DefineConstants.KWHR_HPHR);
	}

	public static float conversionKWHRPielb(float numero)
	{
		return numero * DefineConstants.KWHR_PIELB;
	}

	public static float conversionKWHRLitroAtm(float numero)
	{
		return (float) (numero * DefineConstants.KWHR_LITROATM);
	}

	//Tomando las funciones de conversion de KWHR, hacemos las funciones inversas

	public static float conversionHPHRKWHR(float numero)
	{
		return (float) (numero / DefineConstants.KWHR_HPHR);
	}

	public static float conversionPielbKWHR(float numero)
	{
		return numero / DefineConstants.KWHR_PIELB;
	}

	public static float conversionLitroAtmKWHR(float numero)
	{
		return (float) (numero / DefineConstants.KWHR_LITROATM);
	}

	//Funciones de conversion de HPHR a otras unidades, menos las funciones que contengan Joule, Caloria, KCaloria, BTU ni KWHR

	public static float conversionHPHRPielb(float numero)
	{
		return numero * DefineConstants.HPHR_PIELB;
	}

	public static float conversionHPHRLitroAtm(float numero)
	{
		return numero * DefineConstants.HPHR_LITROATM;
	}

	//Tomando las funciones de conversion de HPHR, hacemos las funciones inversas

	public static float conversionPielbHPHR(float numero)
	{
		return numero / DefineConstants.HPHR_PIELB;
	}

	public static float conversionLitroAtmHPHR(float numero)
	{
		return numero / DefineConstants.HPHR_LITROATM;
	}

	//Funciones de conversion de LitroAtm a otras unidades, menos las funciones que contengan Joule, Caloria, KCaloria, BTU, KWHR ni HPHR

	public static float conversionLitroAtmPielb(float numero)
	{
		return (float) (numero * DefineConstants.LITROATM_PIELB);
	}

	//Tomando las funciones de conversion de HPHR, hacemos las funciones inversas

	public static float conversionPielbLitroAtm(float numero)
	{
		return (float) (numero * DefineConstants.LITROATM_PIELB);
	}
	public static void menu_seleccion()
	{

		System.out.print("\nEscriba la cantidad, después el número correspondiente a la unidad que quiere convertir");

		System.out.print("\n1 -- Joule");
		System.out.print("\n2 -- Caloría");
		System.out.print("\n3 -- KCaloría");
		System.out.print("\n4 -- BTU - British Thermal Unit");
		System.out.print("\n5 -- KW-HR");
		System.out.print("\n6 -- HP-HR");
		System.out.print("\n7 -- Pie-Libra");
		System.out.print("\n8 -- Litro-Atmosfera\n");
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			numero = Float.parseFloat(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			opcion = Integer.parseInt(tempVar2);
		}
		System.out.printf("\n%f",numero);

		switch (opcion)
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

		System.out.printf("El resultado es %f\n", resultado);
	}
	public static void menu_conversionJoule()
	{

		System.out.print("\n\nElija la unidad a la que desea convertir");

		System.out.print("\n1 -- Caloría");
		System.out.print("\n2 -- KCaloría");
		System.out.print("\n3 -- BTU - British Thermal Unit");
		System.out.print("\n4 -- KW-HR");
		System.out.print("\n5 -- HP-HR");
		System.out.print("\n6 -- Pie-Libra");
		System.out.print("\n7 -- Litro-Atmosfera\n");

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			opcion = Integer.parseInt(tempVar);
		}

		switch (opcion)
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
	public static float menu_conversionCaloria()
	{
		System.out.print("Elija la unidad a la que desea convertir");
		System.out.print("\n1 -- Joule");
		System.out.print("\n2 -- KCaloría");
		System.out.print("\n3 -- BTU - British Thermal Unit");
		System.out.print("\n4 -- KW-HR");
		System.out.print("\n5 -- HP-HR");
		System.out.print("\n6 -- Pie-Libra");
		System.out.print("\n7 -- Litro-Atmosfera\n");

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			opcion = Integer.parseInt(tempVar);
		}

		switch (opcion)
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
	public static float menu_conversionKCaloria()
	{
		System.out.print("\n\nElija la unidad a la que desea convertir");
		System.out.print("\n1 -- Joule");
		System.out.print("\n2 -- Caloría");
		System.out.print("\n3 -- BTU - British Thermal Unit");
		System.out.print("\n4 -- KW-HR");
		System.out.print("\n5 -- HP-HR");
		System.out.print("\n6 -- Pie-Libra");
		System.out.print("\n7 -- Litro-Atmosfera\n");

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			opcion = Integer.parseInt(tempVar);
		}

		switch (opcion)
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
	public static float menu_conversionBTU()
	{
		System.out.print("\n\nElija la unidad a la que desea convertir");
		System.out.print("\n1 -- Joule");
		System.out.print("\n2 -- Caloría");
		System.out.print("\n3 -- KCaloría");
		System.out.print("\n4 -- KW-HR");
		System.out.print("\n5 -- HP-HR");
		System.out.print("\n6 -- Pie-Libra");
		System.out.print("\n7 -- Litro-Atmosfera\n");

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			opcion = Integer.parseInt(tempVar);
		}

		switch (opcion)
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
	public static float menu_conversionKWHR()
	{
		System.out.print("\n\nElija la unidad a la que desea convertir");
		System.out.print("\n1 -- Joule");
		System.out.print("\n2 -- Caloría");
		System.out.print("\n3 -- KCaloría");
		System.out.print("\n4 -- BTU - British Thermal Unit");
		System.out.print("\n5 -- HP-HR");
		System.out.print("\n6 -- Pie-Libra");
		System.out.print("\n7 -- Litro-Atmosfera\n");

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			opcion = Integer.parseInt(tempVar);
		}

		switch (opcion)
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
	public static float menu_conversionHPHR()
	{
		System.out.print("\n\nElija la unidad a la que desea convertir");
		System.out.print("\n1 -- Joule");
		System.out.print("\n2 -- Caloría");
		System.out.print("\n3 -- KCaloría");
		System.out.print("\n4 -- BTU - British Thermal Unit");
		System.out.print("\n5 -- KW-HR");
		System.out.print("\n6 -- Pie-Libra");
		System.out.print("\n7 -- Litro-Atmosfera\n");

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			opcion = Integer.parseInt(tempVar);
		}

		switch (opcion)
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
	public static float menu_conversionPielb()
	{
		System.out.print("\n\nElija la unidad a la que desea convertir");
		System.out.print("\n1 -- Joule");
		System.out.print("\n2 -- Caloría");
		System.out.print("\n3 -- KCaloría");
		System.out.print("\n4 -- BTU - British Thermal Unit");
		System.out.print("\n5 -- KW-HR");
		System.out.print("\n6 -- HP-HR");
		System.out.print("\n7 -- Litro-Atmosfera\n");

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			opcion = Integer.parseInt(tempVar);
		}

		switch (opcion)
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
	public static void menu_conversionLitroAtm()
	{
		System.out.print("\n\nElija la unidad a la que desea convertir");
		System.out.print("\n1 -- Joule");
		System.out.print("\n2 -- Caloría");
		System.out.print("\n3 -- KCaloría");
		System.out.print("\n4 -- BTU - British Thermal Unit");
		System.out.print("\n5 -- KW-HR");
		System.out.print("\n6 -- HP-HR");
		System.out.print("\n7 -- Pie-Libra\n");

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			opcion = Integer.parseInt(tempVar);
		}

		switch (opcion)
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

	public static float resultado;
	public static float numero;
	public static int opcion;

	//public static void main(String[] args) 
	//{
	//	menu_seleccion();
	//}
	//Definiciones para Joule a otras unidades y funciones inversas


	//Definiciones para Caloria a otras unidades y funciones inversas, sin Joule


	//Definiciones para KCaloria a otras unidades y funciones inversas, sin Joule ni Caloria


	//Definiciones para Joule a otras unidades y funciones inversas, sin Joule, Caloria ni KCaloria


	//Definiciones para KWHR a otras unidades y funciones inversas, sin Joule, Caloria, KCaloria ni BTU


	//Definiciones para HPHR a otras unidades y funciones inversas, sin Joule, Caloria, KCaloria, BTU ni KWHR


	//Definiciones para LitroAtm a otras unidades y funciones inversas, sin Joule, Caloria, KCaloria, BTU, KWHR ni HPHR


//C++ TO JAVA CONVERTER TODO TASK: The implementation of the following method could not be found:
	//float conversionJouleCaloria(float numero);
//C++ TO JAVA CONVERTER TODO TASK: The implementation of the following method could not be found:
	//float conversionJouleKCaloria(float numero);
//C++ TO JAVA CONVERTER TODO TASK: The implementation of the following method could not be found:
	//float conversionJouleBTU(float numero);
//C++ TO JAVA CONVERTER TODO TASK: The implementation of the following method could not be found:
	//float conversionJouleKWHR(float numero);
//C++ TO JAVA CONVERTER TODO TASK: The implementation of the following method could not be found:
	//float conversionJouleHPHR(float numero);
//C++ TO JAVA CONVERTER TODO TASK: The implementation of the following method could not be found:
	//float conversionJoulePielb(float numero);
//C++ TO JAVA CONVERTER TODO TASK: The implementation of the following method could not be found:
	//float conversionJouleLitroAtm(float numero);
//C++ TO JAVA CONVERTER TODO TASK: The implementation of the following method could not be found:
	//float conversionCaloriaJoule(float numero);
//C++ TO JAVA CONVERTER TODO TASK: The implementation of the following method could not be found:
	//float conversionKCaloriaJoule(float numero);
//C++ TO JAVA CONVERTER TODO TASK: The implementation of the following method could not be found:
	//float conversionBTUJoule(float numero);
//C++ TO JAVA CONVERTER TODO TASK: The implementation of the following method could not be found:
	//float conversionKWHRJoule(float numero);
//C++ TO JAVA CONVERTER TODO TASK: The implementation of the following method could not be found:
	//float conversionHPHRJoule(float numero);
//C++ TO JAVA CONVERTER TODO TASK: The implementation of the following method could not be found:
	//float conversionPielbJoule(float numero);
//C++ TO JAVA CONVERTER TODO TASK: The implementation of the following method could not be found:
	//float conversionLitroAtmJoule(float numero);
//C++ TO JAVA CONVERTER TODO TASK: The implementation of the following method could not be found:
	//float conversionCaloriaKCaloria(float numero);
//C++ TO JAVA CONVERTER TODO TASK: The implementation of the following method could not be found:
	//float conversionCaloriaBTU(float numero);
//C++ TO JAVA CONVERTER TODO TASK: The implementation of the following method could not be found:
	//float conversionCaloriaKWHR(float numero);
//C++ TO JAVA CONVERTER TODO TASK: The implementation of the following method could not be found:
	//float conversionCaloriaHPHR(float numero);
//C++ TO JAVA CONVERTER TODO TASK: The implementation of the following method could not be found:
	//float conversionCaloriaPielb(float numero);
//C++ TO JAVA CONVERTER TODO TASK: The implementation of the following method could not be found:
	//float conversionCaloriaLitroAtm(float numero);
//C++ TO JAVA CONVERTER TODO TASK: The implementation of the following method could not be found:
	//float conversionKCaloriaCaloria(float numero);
//C++ TO JAVA CONVERTER TODO TASK: The implementation of the following method could not be found:
	//float conversionBTUCaloria(float numero);
//C++ TO JAVA CONVERTER TODO TASK: The implementation of the following method could not be found:
	//float conversionKWHRCaloria(float numero);
//C++ TO JAVA CONVERTER TODO TASK: The implementation of the following method could not be found:
	//float conversionHPHRCaloria(float numero);
//C++ TO JAVA CONVERTER TODO TASK: The implementation of the following method could not be found:
	//float conversionPielbCaloria(float numero);
//C++ TO JAVA CONVERTER TODO TASK: The implementation of the following method could not be found:
	//float conversionLitroAtmCaloria(float numero);
//C++ TO JAVA CONVERTER TODO TASK: The implementation of the following method could not be found:
	//float conversionKCaloriaBTU(float numero);
//C++ TO JAVA CONVERTER TODO TASK: The implementation of the following method could not be found:
	//float conversionKCaloriaKWHR(float numero);
//C++ TO JAVA CONVERTER TODO TASK: The implementation of the following method could not be found:
	//float conversionKCaloriaHPHR(float numero);
//C++ TO JAVA CONVERTER TODO TASK: The implementation of the following method could not be found:
	//float conversionKCaloriaPielb(float numero);
//C++ TO JAVA CONVERTER TODO TASK: The implementation of the following method could not be found:
	//float conversionKCaloriaLitroAtm(float numero);
//C++ TO JAVA CONVERTER TODO TASK: The implementation of the following method could not be found:
	//float conversionBTUKCaloria(float numero);
//C++ TO JAVA CONVERTER TODO TASK: The implementation of the following method could not be found:
	//float conversionKWHRKCaloria(float numero);
//C++ TO JAVA CONVERTER TODO TASK: The implementation of the following method could not be found:
	//float conversionHPHRKCaloria(float numero);
//C++ TO JAVA CONVERTER TODO TASK: The implementation of the following method could not be found:
	//float conversionPielbKCaloria(float numero);
//C++ TO JAVA CONVERTER TODO TASK: The implementation of the following method could not be found:
	//float conversionLitroAtmKCaloria(float numero);
//C++ TO JAVA CONVERTER TODO TASK: The implementation of the following method could not be found:
	//float conversionBTUKWHR(float numero);
//C++ TO JAVA CONVERTER TODO TASK: The implementation of the following method could not be found:
	//float conversionBTUHPHR(float numero);
//C++ TO JAVA CONVERTER TODO TASK: The implementation of the following method could not be found:
	//float conversionBTUPielb(float numero);
//C++ TO JAVA CONVERTER TODO TASK: The implementation of the following method could not be found:
	//float conversionBTULitroAtm(float numero);
//C++ TO JAVA CONVERTER TODO TASK: The implementation of the following method could not be found:
	//float conversionKWHRBTU(float numero);
//C++ TO JAVA CONVERTER TODO TASK: The implementation of the following method could not be found:
	//float conversionHPHRBTU(float numero);
//C++ TO JAVA CONVERTER TODO TASK: The implementation of the following method could not be found:
	//float conversionPielbBTU(float numero);
//C++ TO JAVA CONVERTER TODO TASK: The implementation of the following method could not be found:
	//float conversionLitroAtmBTU(float numero);
//C++ TO JAVA CONVERTER TODO TASK: The implementation of the following method could not be found:
	//float conversionKWHRHPHR(float numero);
//C++ TO JAVA CONVERTER TODO TASK: The implementation of the following method could not be found:
	//float conversionKWHRPielb(float numero);
//C++ TO JAVA CONVERTER TODO TASK: The implementation of the following method could not be found:
	//float conversionKWHRLitroAtm(float numero);
//C++ TO JAVA CONVERTER TODO TASK: The implementation of the following method could not be found:
	//float conversionHPHRKWHR(float numero);
//C++ TO JAVA CONVERTER TODO TASK: The implementation of the following method could not be found:
	//float conversionPielbKWHR(float numero);
//C++ TO JAVA CONVERTER TODO TASK: The implementation of the following method could not be found:
	//float conversionLitroAtmKWHR(float numero);
//C++ TO JAVA CONVERTER TODO TASK: The implementation of the following method could not be found:
	//float conversionHPHRPielb(float numero);
//C++ TO JAVA CONVERTER TODO TASK: The implementation of the following method could not be found:
	//float conversionHPHRLitroAtm(float numero);
//C++ TO JAVA CONVERTER TODO TASK: The implementation of the following method could not be found:
	//float conversionPielbHPHR(float numero);
//C++ TO JAVA CONVERTER TODO TASK: The implementation of the following method could not be found:
	//float conversionLitroAtmHPHR(float numero);
//C++ TO JAVA CONVERTER TODO TASK: The implementation of the following method could not be found:
	//float conversionLitroAtmPielb(float numero);
//C++ TO JAVA CONVERTER TODO TASK: The implementation of the following method could not be found:
	//float conversionPielbLitroAtm(float numero);
}