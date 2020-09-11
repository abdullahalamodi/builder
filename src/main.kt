class Employee {
    val firstName: String;
    val lastName: String;
    val id: String;
    val isManager: Boolean;
    val managerId: String;

    private constructor(builder: Builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.id = builder.id;
        this.isManager = builder.isManager;
        this.managerId = builder.managerId;
    }

    companion object Builder {
        private var firstName: String = "";
        private var lastName: String = "";
        private var id: String = "";
        private var isManager: Boolean = false;
        private var managerId: String = "";

        fun build(): Employee {
            return Employee(this);
        }


        fun setFirstName(firstName: String): Builder {
            this.firstName = firstName;
            return this;
        }

        fun setLastName(lastName: String): Builder {
            this.lastName = lastName;
            return this;
        }

        fun setId(id: String): Builder {
            this.id = id;
            return this;
        }

        fun setIsManager(manager: Boolean): Builder {
            this.isManager = manager;
            return this;
        }

        fun setManagerId(managerId: String): Builder {
            this.managerId = managerId;
            return this;
        }
    }

}

class Employee1(var firstName: String = "",var lastName: String = "",var isManager: Boolean = false,var managerId: String = "") {

}

fun main() {
    //first way
    val employee = Employee.Builder
            .setFirstName("Doug")
            .setLastName("Sigelbaum")
            .setIsManager(false)
            .setManagerId("XXX")
            .build();

//    second way
    val employee1 = Employee1().apply {
        firstName = "Doug"
        lastName = "Sigelbaum"
        isManager = false
        managerId = "XXX"
    }

    // println(employee.firstName);


}