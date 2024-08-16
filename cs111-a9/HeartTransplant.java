/**
 * 
 * HeartTransplant class
 * 
 * @author Ana Paula Centeno
 * @author Haolin (Daniel) Jin
 */
public class HeartTransplant 
{

    // patient array, each Patient is read from the data file
    private Patient[] patients;

    // SurvivabilityByAge array, each rate is read from data file
    private SurvivabilityByAge survivabilityByAge;

    // SurvivabilityByCause array, each rate is read from data file
    private SurvivabilityByCause survivabilityByCause;

    /*
     * Default constructor
     * Initializes patients to null.
     * Initializes survivabilityByAge to null.
     * Initializes survivabilityByCause to null. 
     */
    public HeartTransplant() 
    {

        // WRITE YOUR CODE HERE
        this.patients = null;
        this.survivabilityByAge = null;
        this.survivabilityByCause = null;
    }

    /*
     * Returns patients
     */
    public Patient[] getPatients() 
    {

        // WRITE YOUR CODE HERE
        return patients;
     } 

    /*
     * Returns survivabilityByAge
     */
    public SurvivabilityByAge getSurvivabilityByAge() 
    {
        // WRITE YOUR CODE HERE
        return survivabilityByAge;
    }

    /*
     * Returns survivabilityByCause
     */
    public SurvivabilityByCause getSurvivabilityByCause() 
    {
        // WRITE YOUR CODE HERE
        return survivabilityByCause;
    }

    /*
     * 1) Initialize the instance variable patients array with numberOfLines length.
     * 
     * 2) Reads from the command line data file, use StdIn.readInt() to read an integer.
     *    File Format: 
     *      ID, ethnicity, Gender, Age, Cause, Urgency, State of health
     * 
     *    Each line refers to one Patient, all values are integers.
     * 
     */
    public void readPatients (int numberOfLines) 
    {
        // WRITE YOUR CODE HERE

        patients = new Patient[numberOfLines];

        for(int i = 0; i < numberOfLines; i++)
        {
            patients[i] = new Patient(StdIn.readInt(), StdIn.readInt(), StdIn.readInt(), StdIn.readInt(), StdIn.readInt(), StdIn.readInt(), StdIn.readInt());
        }
    }

    /*
     * 1) Initialize the instance variable survivabilityByAge with a new survivabilityByAge object.
     * 
     * 2) Reads from the command line file to populate the object. 
     *    Use StdIn.readInt() to read an integer and StdIn.readDouble() to read a double.
     * 
     *    File Format: Age YearsPostTransplant Rate
     *    Each line refers to one survivability rate by age.
     * 
     */
    public void readSurvivabilityByAge (int numberOfLines) 
    {
        // WRITE YOUR CODE HERE

        survivabilityByAge = new SurvivabilityByAge();

        for(int i = 0; i < numberOfLines; i++)
        {
            survivabilityByAge.addData(StdIn.readInt(), StdIn.readInt(), StdIn.readDouble());
        }
    }

    /*
     * 1) Initialize the instance variable survivabilityByCause with a new survivabilityByCause object.
     * 
     * 2) Reads from the command line file to populate the object. Use StdIn.readInt() to read an 
     *    integer and StdIn.readDouble() to read a double.
     * 
     *    File Format: Cause YearsPostTransplant Rate
     *    Each line refers to one survivability rate by cause.
     * 
     */
    public void readSurvivabilityByCause (int numberOfLines) 
    {
        // WRITE YOUR CODE HERE

        survivabilityByCause = new SurvivabilityByCause();

        for(int i = 0; i < numberOfLines; i++)
        {
            survivabilityByCause.addData(StdIn.readInt(), StdIn.readInt(), StdIn.readDouble());
        }
    }
    
    /*
     * Returns a Patient array containing the patients, 
     * from the patients array, that have age above the parameter age.
     * 
     * The return array has to be completely full with no empty
     * spots, that is the array size should be equal to the number
     * of Patients with age above the parameter age.
     * 
     * Return null if there is no Patient with age above the 
     * parameter age.
     */ 
    public Patient[] getPatientsWithAgeAbove(int age) 
    {
        // WRITE YOUR CODE HERE
        int count = 0;
        for(int i = 0; i < patients.length; i++)
        {
            if(patients[i].getAge() > age)
            {
                count++;
            }
        }
        Patient[] patient_aboveage = new Patient[count];
        int j = 0;
        for(int i = 0; i < patients.length; i++)
        {
            if(patients[i].getAge() > age)
            {
                patient_aboveage[j] = patients[i];
                j++;
            }
        }
        if(patient_aboveage.length > 0)
        {
            return patient_aboveage;
        }
        else
        {
            return null;
        }
    }
        

    /*
     * Returns a Patient array containing the patients, from the patients array, 
     * that have the heart condition cause equal to the parameter cause.
     * 
     * The return array has to be completely full with no empty
     * spots, that is the array size should be equal to the number
     * of Patients with the heart condition cause equal to the parameter cause.
     * 
     * Return null if there is no Patient with the heart condition cause 
     * equal to the parameter cause.
     */ 
    public Patient[] getPatientsByHeartConditionCause(int cause) 
    {

        // WRITE YOUR CODE HERE
        int count = 0;
        for(int i = 0; i < patients.length; i++)
        {
            if(patients[i].getCause() == cause)
            {
                count++;
            }
        }
        Patient[] patient_cause = new Patient[count];
        int j = 0;
        for(int i = 0; i < patients.length; i++)
        {
            if(patients[i].getCause() == cause)
            {
                patient_cause[j] = patients[i];
                j++;
            }
        }
        if(patient_cause.length > 0)
        {
            return patient_cause;
        }
        else
        {
            return null;
        }
        
    }

    /*
     * Returns a Patient array containing patients, from the patients array,
     * that have the state of health equal to the parameter state.
     * 
     * The return array has to be completely full with no empty
     * spots, that is the array size should be equal to the number
     * of Patients with the state of health equal to the parameter state.
     * 
     * Return null if there is no Patient with the state of health 
     * equal to the parameter state.
     */ 
    public Patient[] getPatientsByUrgency(int urgency) 
    {

        // WRITE YOUR CODE HERE
        int count = 0;
        for(int i = 0; i < patients.length; i++)
        {
            if(patients[i].getUrgency() == urgency) 
            {
                count++;
            }
        }
        Patient[] patient_urgency = new Patient[count];
        int j = 0;
        for(int i = 0; i < patients.length; i++)
        {
            if(patients[i].getUrgency() == urgency)
            {
                patient_urgency[j] = patients[i];
                j++;
            }
        }
        if(patient_urgency.length > 0)
        {
            return patient_urgency;
        }
        else
        {
            return null;
        }
    }
       

    /*
     * Assume there is a heart available for transplantation surgery.
     * Also assume that the heart is of the same blood type as the
     * Patients on the patients array.
     * This method finds the Patient to be the recepient of this
     * heart.
     * 
     * The method returns a Patient from the patients array with
     * he highest potential for survivability after the transplant.
     * 
     * Assume the patient returned by this method will receive a heart,
     * therefore the Patient will no longer need a heart.
     * 
     * There is no correct solution, you may come up with any 
     * function to find the patient with the highest potential 
     * for survivability after the transplant.
     */ 
    public Patient getPatientForTransplant () 
    {
	// WRITE YOUR CODE HERE
        double rAge = 0.0;
        double rCause = 0.0;
        double sRate = 0.0;
        Patient[] pa = patients;
        Patient p = new Patient(0, 0, 0, 0, 0, 0, 0);

        for(int i = 0; i < pa.length; i++)
        {
            if(pa[i].getNeedHeart())
            {
                rAge = survivabilityByAge.getRate(pa[i].getAge(), 5);
                rCause = survivabilityByCause.getRate(pa[i].getCause(), 5);

                if(rAge > 0 && rCause > 0)
                {
                    sRate = ((rAge + rCause) / 2.0);
                    pa[i].setNeedHeart(false);
                    p = pa[i];
                    break;
                }
            }
        }
        return p;
    }
}

