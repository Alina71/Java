package exemplu;

        class Main {
            String label;
            double price;
            String category="misc";
            boolean hasExpiration=false;
            int stock=0;

            public Main(String mLabel,double mPrice,String mCategory, boolean mHasExpiration, int mStock){
                label=mLabel;
                price=mPrice;
                category=mCategory;
                hasExpiration=mHasExpiration;
                stock=mStock;
            }
            public Main(String mLabel,double mPrice,int mStock){
                label=mLabel;
                price=mPrice;
                stock=mStock;
            }
            public Main(String mLabel,double mPrice){
                label=mLabel;
                price=mPrice;

            }
            void storeProduct(){
                System.out.println(label+" "+price+" "+category+" "+hasExpiration+" "+stock);
            }
            public static void main(String [] args){
                Main p1=new Main("eggs", 3.0,"Produce",true,12);
                p1.storeProduct();
                Main p2=new Main("Paper Towels",2.0,24);
                p2.storeProduct();
                Main p3=new Main("Paper Towels",2);
                p3.storeProduct();
            }
        }