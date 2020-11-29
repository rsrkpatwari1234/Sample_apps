package com.example.doit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //SPINNER 1
        // access the items of the list
        val company = resources.getStringArray(R.array.company_list)

        // access the spinner
        val spinner1 = findViewById<Spinner>(R.id.spinner1)
        if (spinner1 != null) {
            val adapter = ArrayAdapter(this,
                android.R.layout.simple_spinner_item, company)
            spinner1.adapter = adapter

            spinner1.onItemSelectedListener = object :
                AdapterView.OnItemSelectedListener {
                override fun onItemSelected(parent: AdapterView<*>,
                                            view: View, position: Int, id: Long) {
                    Toast.makeText(this@MainActivity,
                        getString(R.string.choose_company) + " " +
                                "" + company[position], Toast.LENGTH_SHORT).show()
                }

                override fun onNothingSelected(parent: AdapterView<*>) {
                    // write code to perform some action
                }
            }
        }

        //SPINNER 2
        // access the items of the list
        val topics = resources.getStringArray(R.array.topic_list)

        // access the spinner
        val spinner2 = findViewById<Spinner>(R.id.spinner2)
        if (spinner2 != null) {
            val adapter = ArrayAdapter(this,
                android.R.layout.simple_spinner_item, topics)
            spinner2.adapter = adapter

            spinner2.onItemSelectedListener = object :
                AdapterView.OnItemSelectedListener {
                override fun onItemSelected(parent: AdapterView<*>,
                                            view: View, position: Int, id: Long) {
                    Toast.makeText(this@MainActivity,
                        getString(R.string.choose_topic) + " " +
                                "" + topics[position], Toast.LENGTH_SHORT).show()
                }

                override fun onNothingSelected(parent: AdapterView<*>) {
                    // write code to perform some action
                }
            }
        }

        //SPINNER 3
        // access the items of the list
        val interviewType = resources.getStringArray(R.array.type_of_interview_list)

        // access the spinner
        val spinner3 = findViewById<Spinner>(R.id.spinner3)

        if (spinner3 != null) {
            val adapter = ArrayAdapter(this,
                android.R.layout.simple_spinner_item, interviewType)
            spinner3.adapter = adapter

            spinner3.onItemSelectedListener = object :
                AdapterView.OnItemSelectedListener {
                override fun onItemSelected(parent: AdapterView<*>,
                                            view: View, position: Int, id: Long) {
                    Toast.makeText(this@MainActivity,
                        getString(R.string.choose_type_of_interview) + " " +
                                "" + interviewType[position], Toast.LENGTH_SHORT).show()
                }

                override fun onNothingSelected(parent: AdapterView<*>) {
                    // write code to perform some action
                }
            }
        }
        //SPINNER 4
        // access the items of the list
        val college = resources.getStringArray(R.array.college_list)

        // access the spinner
        val spinner4 = findViewById<Spinner>(R.id.spinner4)
        if (spinner4 != null) {
            val adapter = ArrayAdapter(this,
                android.R.layout.simple_spinner_item, college)
            spinner4.adapter = adapter

            spinner4.onItemSelectedListener = object :
                AdapterView.OnItemSelectedListener {
                override fun onItemSelected(parent: AdapterView<*>,
                                            view: View, position: Int, id: Long) {
                    Toast.makeText(this@MainActivity,
                        getString(R.string.choose_college) + " " +
                                "" + college[position], Toast.LENGTH_SHORT).show()
                }

                override fun onNothingSelected(parent: AdapterView<*>) {
                    // write code to perform some action
                }
            }
        }
        //SPINNER 5
        // access the items of the list
        val jobs = resources.getStringArray(R.array.nature_of_job)

        // access the spinner
        val spinner5 = findViewById<Spinner>(R.id.spinner5)
        if (spinner5 != null) {
            val adapter = ArrayAdapter(this,
                android.R.layout.simple_spinner_item, jobs)
            spinner5.adapter = adapter

            spinner5.onItemSelectedListener = object :
                AdapterView.OnItemSelectedListener {
                override fun onItemSelected(parent: AdapterView<*>,
                                            view: View, position: Int, id: Long) {
                    Toast.makeText(this@MainActivity,
                        getString(R.string.choose_nature_of_job) + " " +
                                "" + jobs[position], Toast.LENGTH_SHORT).show()
                }

                override fun onNothingSelected(parent: AdapterView<*>) {
                    // write code to perform some action
                }
            }
        }
    }
}