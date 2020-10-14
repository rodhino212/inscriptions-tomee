
public class Formation {
        private int id;
        private String name;
        private String duree;

        public int getId() {
            return id;
        }
    
        public void setId(int id) {
            this.id = id;
        }

        
        public String getName() {
            return name;
        }
    
        public void setName(String name) {
            this.name = name;
        }
    
        public String getDuree() {
            return duree;
        }
    
        public void setDuree(String duree) {
            this.duree = duree;
        }

        public Formation(int id, String name, String duree) {
            this.id = id;
            this.name = name;
            this.duree = duree;
        }
}
