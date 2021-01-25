package com.sl.ms.sprint1.superleaguesprint1.util;

import java.time.LocalDate;
import com.opencsv.bean.CsvBindByPosition;

public class ShopInventoryBean1 {
	@CsvBindByPosition(position = 0)
	private String Id;

	@CsvBindByPosition(position = 1)
	private String Name;

	@CsvBindByPosition(position = 2)
	private String Price;

	@CsvBindByPosition(position = 3)
	private String Stock;

	@CsvBindByPosition(position = 4)
	private String Sales;

	@CsvBindByPosition(position = 5)
	private String OrderDate;

}
