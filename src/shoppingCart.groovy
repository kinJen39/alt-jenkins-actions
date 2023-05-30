/**
* Class shoppingCart, example
*
class ShoppingCart {
    List<String> items
    
    ShoppingCart() {
        items = []
    }
    
    void addItem(String item) {
        items.add(item)
    }
    
    void removeItem(String item) {
        items.remove(item)
    }
    
    void displayItems() {
        println("Shopping Cart Items:")
        items.each { println("- $it") }
    }
}
