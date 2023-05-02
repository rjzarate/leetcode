/*
You are given the array paths, where paths[i] = [cityAi, cityBi] means there exists a direct path going from cityAi to cityBi. Return the destination city, that is, the city without any path outgoing to another city.

It is guaranteed that the graph of paths forms a line without any loop, therefore, there will be exactly one destination city.

https://leetcode.com/problems/destination-city/description/
*/

class Solution {
    public String destCity(List<List<String>> paths) {
        HashSet<String> startingCities = new HashSet<String>();
        for (List<String> cities: paths)
            startingCities.add(cities.get(0));
        for (List<String> cities: paths) {
            if (!startingCities.contains(cities.get(1)))
                return cities.get(1);
        }
        return null;
    }
}
