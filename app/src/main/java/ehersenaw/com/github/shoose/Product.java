package ehersenaw.com.github.shoose;

import android.os.Parcel;
import android.os.Parcelable;

public class Product implements Parcelable {
    int pid = 0;
    String type = "aaa";
    String pname = "bbb";
    int price = 0;
    String brand = "ccc";
    String img_url = "https://stockx.imgix.net/Nike-Air-Max-1-97-Sean-Wotherspoon-NA-Product.jpg?fit=fill&bg=FFFFFF&w=300&h=214&auto=format,compress&trim=color&q=90&dpr=2&updated_at=1538080256";
    double point=0;
    double user_score =0;
    String link = "http://m.coupang.com/vm/products/17090984?vendorItemId=3111328892";

    public Product() {
    }

    public Product(int product_SN, String type, String name, int price, String brand, String img_url,double point, String shop_url, double user_score) {
        this.pid = product_SN;
        this.type = type;
        this.pname = name;
        this.price = price;
        this.brand = brand;
        this.img_url = img_url;
        this.point = point;
        this.link = shop_url;
        this.user_score = user_score;
    }

    protected Product(Parcel in) {
        pid = in.readInt();
        type = in.readString();
        pname = in.readString();
        price = in.readInt();
        brand = in.readString();
        img_url = in.readString();
        point = in.readDouble();
        link = in.readString();
        user_score = in.readDouble();
    }

    public final Creator<Product> CREATOR = new Creator<Product>() {
        @Override
        public Product createFromParcel(Parcel in) {
            return new Product(in);
        }

        @Override
        public Product[] newArray(int size) {
            return new Product[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(pid);
        dest.writeString(type);
        dest.writeString(pname);
        dest.writeInt(price);
        dest.writeString(brand);
        dest.writeString(img_url);
        dest.writeDouble(point);
        dest.writeString(link);
        dest.writeDouble(user_score);
    }
}