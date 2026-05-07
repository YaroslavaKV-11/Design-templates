public class WalkStrategy implements RouteStrategy {

    public String buildRoute(String A, String B) {
        return "Пішохідний маршрут з пункту " + A + " до пункту " + B;
    }
}