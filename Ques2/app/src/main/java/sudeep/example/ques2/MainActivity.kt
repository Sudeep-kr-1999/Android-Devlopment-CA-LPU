package sudeep.example.ques2
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*


class MainActivity : AppCompatActivity() {
    var resultString=StringBuilder()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val radioGroup=findViewById<RadioGroup>(R.id.radio_group)
        val checkbox1=findViewById<CheckBox>(R.id.checkbox_1)
        val checkbox2=findViewById<CheckBox>(R.id.checkbox_2)
        val checkbox3=findViewById<CheckBox>(R.id.checkbox_3)
        val checkbox4=findViewById<CheckBox>(R.id.checkbox_4)
        val suggestionText=findViewById<EditText>(R.id.suggestion_text)
        val submitBtn=findViewById<Button>(R.id.submit_btn)
        val resultView=findViewById<TextView>(R.id.result_view)

        radioGroup.setOnCheckedChangeListener { group, checkedId ->
            val radioButton=findViewById<RadioButton>(checkedId)
            val output:String=radioButton.text.toString()
            Toast.makeText(applicationContext,output,Toast.LENGTH_LONG).show()
        }

        checkbox1.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked){
                val checkBoxText:String=checkbox1.text.toString()
                Toast.makeText(applicationContext,checkBoxText,Toast.LENGTH_LONG).show()
            }
        }

        checkbox2.setOnCheckedChangeListener { buttonView, isChecked ->
            if(isChecked){
                val checkBoxText:String=checkbox2.text.toString()
                Toast.makeText(applicationContext,checkBoxText,Toast.LENGTH_LONG).show()
            }
        }

        checkbox3.setOnCheckedChangeListener { buttonView, isChecked ->
            if(isChecked){
                val checkBoxText:String=checkbox3.text.toString()
                Toast.makeText(applicationContext,checkBoxText,Toast.LENGTH_LONG).show()
            }
        }

        checkbox4.setOnCheckedChangeListener { buttonView, isChecked ->
            if(isChecked){
                val checkBoxText:String=checkbox4.text.toString()
                Toast.makeText(applicationContext,checkBoxText,Toast.LENGTH_LONG).show()
            }
        }

        submitBtn.setOnClickListener {
            val selectID:Int=radioGroup.checkedRadioButtonId
            val radioButton=findViewById<RadioButton>(selectID)
            val output:String=radioButton.text.toString()
            resultString.append("Selected Radio Button : $output")
            if(checkbox1.isChecked){
                val checkBoxText:String=checkbox1.text.toString()
                resultString.append("\nCheckbox 1 Selected : $checkBoxText")
            }
            if(checkbox2.isChecked){
                val checkBoxText:String=checkbox2.text.toString()
                resultString.append("\nCheckbox 2 Selected : $checkBoxText")
            }
            if(checkbox3.isChecked){
                val checkBoxText:String=checkbox3.text.toString()
                resultString.append("\nCheckbox 3 Selected : $checkBoxText")
            }
            if(checkbox4.isChecked){
                val checkBoxText:String=checkbox4.text.toString()
                resultString.append("\nCheckbox 4 Selected : $checkBoxText")
            }
            if(suggestionText.text.toString().isEmpty()){
                resultString.append("\n")
            }else{
                val suggestionTextString:String=suggestionText.text.toString()
                resultString.append("\nSuggestion Text : $suggestionTextString")
            }
            resultView.text=resultString.toString()
            resultString.clear()
        }

    }
}
