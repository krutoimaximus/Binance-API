import com.binance.api.client.BinanceApiClientFactory;
import com.binance.api.client.BinanceApiRestClient;
import com.binance.api.client.domain.market.TickerStatistics;

public class App {
    public static void main(String[] args) {


    System.out.println("Hello World!!");


        BinanceApiClientFactory factory = BinanceApiClientFactory.newInstance();
        BinanceApiRestClient client = factory.newRestClient();

        TickerStatistics tickerStatistics = client.get24HrPriceStatistics("EGLDUSDT");
        System.out.println(tickerStatistics.getLastPrice());;

    }
}
