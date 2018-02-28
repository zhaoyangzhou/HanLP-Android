

import java.io.Serializable;

/**
 * Created by Joe on 2016/4/10.
 */
public class StockCodeEntity implements Serializable {
    private long id;
    private String stockCode;
    private String stockName;
    private String stockNamePinyin;
    private int market;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    /** 股票代码
     * @param stockCode
     */
    public void setStockCode(String stockCode) {
        this.stockCode = stockCode;
    }

    public String getStockName() {
        return stockName;
    }

    /** 股票名称
     * @param stockName
     */
    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public int getMarket() {
        return market;
    }

    public void setMarket(int market) {
        this.market = market;
    }


    public String getStockCode() {
        return stockCode;
    }


    public String getStockNamePinyin() {
        return stockNamePinyin;
    }

    public void setStockNamePinyin(String stockNamePinyin) {
        this.stockNamePinyin = stockNamePinyin;
    }
}
