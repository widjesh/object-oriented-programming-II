public class Temperature{
    @Column("DISTRICT")
    private string district;
    @Column("TEMPERATURE")
    private float temperature;
    @Column("DATE")
    private Date date; 
}

//Optie 1
INSERT INTO TABLE WHERE DISTRICT = {district}
SELECT * FROM TABLE X WHERE TEMPERATURE > 25

//Optie 2
// API -->  JPA (Java Persistence API) 
saveToDb(temperature)
getAllTemperaturesWhereTemperatureIsHigher(float temperature)


