Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- != 0){
            int online = sc.nextInt();
            int dining = sc.nextInt();
            int a = online * 10;
            int b = a / 100;
            int  discountCoupon = online - b;
            if(discountCoupon < dining){
                System.out.println("ONLINE");
            }
            else if(discountCoupon > dining){
                System.out.println("DININE");
            }
            else{
                System.out.println("EITHER");
            }
        }