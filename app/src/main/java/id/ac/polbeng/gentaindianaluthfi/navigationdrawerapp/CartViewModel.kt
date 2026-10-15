package id.ac.polbeng.gentaindianaluthfi.navigationdrawerapp

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CartViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is cart fragment"
    }
    val text: LiveData<String> = _text
}
