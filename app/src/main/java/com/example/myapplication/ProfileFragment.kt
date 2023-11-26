package com.example.myapplication


import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.firebase.auth.FirebaseAuth
import com.squareup.picasso.Picasso

class ProfileFragment : Fragment() {

    private lateinit var auth: FirebaseAuth
    private lateinit var userInfoTextView: TextView
    private lateinit var profilePictureImageView: ImageView
    private lateinit var logoutButton: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_profile, container, false)

        // Initialize Firebase Auth
        auth = FirebaseAuth.getInstance()

        // Initialize UI elements
        userInfoTextView = view.findViewById(R.id.user_info)
        profilePictureImageView = view.findViewById(R.id.profile_picture)
        logoutButton = view.findViewById(R.id.logout_button)

        // Display user information and profile picture if the user is authenticated
        val currentUser = auth.currentUser
        if (currentUser != null) {
            val displayName = currentUser.displayName
            val email = currentUser.email
            val userInfo = "Username: $displayName\n\nEmail: \n $email"
            userInfoTextView.text = userInfo

            // Fetch and load the user's Google profile image if available
            val googleSignInAccount = GoogleSignIn.getLastSignedInAccount(requireContext())
            if (googleSignInAccount != null) {
                val photoUrl = googleSignInAccount.photoUrl
                if (photoUrl != null) {
                    // Load the profile image using Picasso library
                    Picasso.get().load(photoUrl).into(profilePictureImageView)
                } else {
                    // Set a default image if the profile image URL is not available
                    profilePictureImageView.setImageResource(R.drawable.ic_launcher_foreground)
                }
            }
        } else {
            userInfoTextView.text = "User not authenticated"
        }

        // Handle the logout button click
        logoutButton.setOnClickListener {
            // Sign out the user
            auth.signOut()
            // Navigate to the sign-in activity or any other desired destination
            // For example, you can start a new SignInAct activity here.
            startActivity(Intent(context, SignInAct::class.java))
        }

        return view
    }
}
