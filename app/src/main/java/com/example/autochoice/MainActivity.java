package com.example.autochoice;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recycler_view;
    private CarAdapter carAdapter;
    private List<Car> carList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recycler_view = findViewById(R.id.recycler_view);
        recycler_view.setLayoutManager(new LinearLayoutManager(this));

        carList = new ArrayList<>();
        carList.add(new Car("Aston Martin", "Aston Martin Limited", "Aston Martin Limited — британский производитель престижных спортивных автомобилей. У истоков марки стояли Лайонел Мартин и Роберт Бэмфорд. Штаб-квартира находится в Гейдоне[англ.], Уорикшир. Название компании происходит от названия холма Астон-Клинтон, где один из создателей, Лайонел Мартин, одержал в 1913 году победу в гонке на Singer-10. С 1994 года являлся частью Premier Automotive Group — подразделения Ford Motor Company, однако в августе 2006 года Ford опубликовал намерение продать компанию Aston Martin[2]. Во II квартале 2007 года Ford Motor Company продала Aston Martin консорциуму инвесторов во главе с владельцем компании Prodrive, давним поклонником и коллекционером автомобилей Aston Martin, Дэвидом Ричардсом. Сумма сделки составила $925 млн. В декабре 2012 года частный инвестиционный фонд Investindustrial вложил в фирму 120 миллионов фунтов стерлингов в обмен на 37,5 % акций[3][4]. В 2013 году Aston Martin подписала договор о стратегическом партнёрстве с немецким автопроизводителем Daimler AG, соглашение предусматривает совместную разработку нового двигателя V8 и помощь в создании автомобилей Aston Martin следующего поколения.", R.drawable.car2));
        carList.add(new Car("Lamborghini", "Automobili Lamborghini S.p.A.", "Automobili Lamborghini S.p.A. (итал: Lamborghini — [lamborˈɡiːni] — Ламборги́ни[7]) — итальянская компания, производитель дорогих спортивных автомобилей под маркой Lamborghini. Находится в коммуне Сант-Агата-Болоньезе, около Болоньи. Компания основана в 1963 году Ферруччо Ламборгини; на тот момент он уже был владельцем крупной компании по производству тракторов.\n" +
                "\n" +
                "Сам Ламборгини после основания автомобильной компании владел ею ещё 9 лет. Сегодняшний владелец компании — Audi[5].", R.drawable.car1));
        carList.add(new Car("Rolls-Royce", " Rolls-Royce Motor Cars", "Rolls-Royce Motor Cars Ltd (Роллс-Ройс) — английская компания, подразделение BMW AG, специализирующаяся на выпуске автомобилей класса люкс под маркой Rolls-Royce.", R.drawable.car3));
        carList.add(new Car("Maserati", "Maserati S.p.A. (кратко: Maserati — рус. «Мазера́ти») ", "Maserati S.p.A. (кратко: Maserati — рус. «Мазера́ти») — итальянская компания, производитель эксклюзивных автомобилей спортивного и бизнес-класса. Основана 1 декабря 1914 года в Болонье, Италия. Эмблемой компании является трезубец Посейдона, элемент фонтана Нептуна в Болонье. Штаб-квартира находится в городе Модена, Италия. В настоящее время компанией владеет международный холдинг Stellantis. В 2017 году компания отгрузила продавцам рекордные в истории 51 500 автомобилей (в 1998 году было отгружено всего 518 автомобилей), в 2019 году количество произведённых автомобилей снизилось до 19 300.", R.drawable.car4));
        carList.add(new Car("Bugatti", "Bugatti Automobiles S.A.S. (кратко: Bugatti — «Буга́тти») ", "Bugatti Automobiles S.A.S. (кратко: Bugatti — «Буга́тти») — ранее итальянская, сейчас французская автомобилестроительная компания, специализирующаяся на выпуске легковых автомобилей класса люкс под маркой Bugatti. Штаб-квартира — фамильное поместье Шато Сэн-Жан (фр. Château Saint Jean) — и производство находятся в эльзасском городе Мольсеме. В ноябре 2021 года компания стала частью Bugatti Rimac, совместного предприятия между Rimac Automobili и Porsche AG.[1]", R.drawable.car5));
        carList.add(new Car("Ferrari", "Ferrari, «Ферра́ри»", "Ferrari, «Ферра́ри» — итальянская компания, выпускающая спортивные и гоночные автомобили, базирующаяся в Маранелло. Основана в 1939 году Энцо Феррари, с 1947 года начала выпуск спортивных автомобилей; с 1969 года входила в концерн FIAT, с 2016 года — самостоятельная компания, зарегистрированная в Нидерландах. На протяжении всей своей истории, компания участвует в различных гонках, особенно в Формуле-1, где она имеет наибольший успех. Эмблема «Феррари» — гарцующий жеребец на жёлтом фоне. Традиционный цвет автомобилей — красный, но компания выпускает автомобили и других цветов.", R.drawable.car6));
        carList.add(new Car("Porsche", "Doktor Ingenieur honoris causa Ferdinand Porsche Aktiengesellschaft", "Porsche AG (немецкое произношение [ˈpɔʁʃə][5] — Пóрше[6]; полное наименование Doktor Ingenieur honoris causa Ferdinand Porsche Aktiengesellschaft) — немецкий производитель автомобилей, основанный конструктором Фердинандом Порше в 1931 году[⇨], в настоящее время — дочерняя структура Porsche Automobil Holding. Штаб-квартира и основной завод находятся в Штутгарте, Германия[7].", R.drawable.car7));
        carList.add(new Car("Marussia Motors", "Marussia Motors (рус. Маруся Моторс) ", "Marussia Motors (рус. Маруся Моторс) — российская автомобильная компания, анонсировавшая производство спортивных автомобилей под брендом Marussia.", R.drawable.car8));
        carList.add(new Car("Bentley Motors", "Bentley Motors Ltd.", "Bentley Motors Ltd. ([ˈbɛːntli]) — британская автомобилестроительная компания, специализирующаяся на производстве автомобилей класса «люкс». С 1998 года входит в состав немецкого концерна Volkswagen AG.", R.drawable.car9));

        carAdapter = new CarAdapter(carList, this);
        recycler_view.setAdapter(carAdapter);
    }
}