
    class Ship {
        private int currentCargo;

        public Ship() {
            this.currentCargo = 0;
        }

        public void loadCargo(Order order) {
            currentCargo += order.getCargoWeight();
        }

        public void deliverCargo(int earnings) {
            // Simulate delivering cargo and earning money
            // You can add more logic here if needed
        }

        public void sendToMaintenance() {
            // Simulate sending the ship to maintenance
            // You can add more logic here if needed
        }
}
