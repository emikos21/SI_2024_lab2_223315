Втора лабораториска вежба по Софтверско инженерство

Емилиа Костофски, бр. на индекс 223315

Control Flow Graph

![Control Flow Graph](https://github.com/emikos21/SI_2024_lab2_223315/assets/152331669/13ffbb4a-d2d3-4d9d-b6c5-110ea0478793)

Цикломатска комплексност

Цикломатската комплексност на овој код е 10, истата ја добив преку формулата P+1, каде што P е бројот на предикатни јазли. Во случајoв P=9, па цикломатската комплексност изнесува 10.

Тест случаи според критериумот Multiple Condition

За условот if (item.getPrice() > 300 && item.getDiscount() > 0 && item.getBarcode().charAt(0) == '0')

-TTT -> item.price = 450; item.discount = 0.3; item.barcode = "0987"

-TTF -> item.price = 500; item.discount = 0.3; item.barcode = "1987"

-TFX -> item.price = 550; item.discount = -0.3; item.barcode = any

-FXX -> item.price = 150; item.discount = any; item.barcode = any
