public class Client {
    public static void main(String[] args) {
        Request[] requests = {
                new Request(Request.Type.TYPE1),
                new Request(Request.Type.TYPE2),
                new Request(Request.Type.TYPE1),
                new Request(Request.Type.TYPE3),
                new Request(Request.Type.TYPE4),
                new Request(Request.Type.TYPE2),
                new Request(Request.Type.TYPE4),
                new Request(Request.Type.TYPE1),
        };

        RequestHandler handler1 = new Type1Handler();
        RequestHandler handler2 = new Type2Handler();
        RequestHandler handler3 = new Type3Handler();
        RequestHandler handler4 = new Type4Handler();

        handler1.setNext(handler2).setNext(handler3).setNext(handler4);

        for (Request request : requests) {
            handler1.handle(request);
        }
    }
}