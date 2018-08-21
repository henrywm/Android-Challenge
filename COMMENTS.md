## Used libraries.
- <a href="https://square.github.io/retrofit/" target="_blank">Retrofit</a>
- <a href="https://github.com/google/gson" target="_blank">Gson</a>
- <a href="https://bumptech.github.io/glide/" target="_blank">Glide</a>
- <a href="https://developer.android.com/topic/libraries/architecture/roomRoom" target="_blank">Room</a>
- <a href="https://developer.android.com/topic/libraries/architecture/viewmodel" target="_blank">ViewModel</a>
- <a href="https://developer.android.com/topic/libraries/architecture/livedata" target="_blank">LiveData</a>

## Chosen Architecture
Honestly, I'm still studying about architectures and how to apply each one in different cases. I've tried to apply MVP for some situations and MVVM to other, cause in my mind it'd be a better solution. In the case of MVP, I also have used Controllers to work like a notifier, telling to the View the result of my request. When I need to observe the list of results, I used MVVM, and with this it was possible to solve the problem of lost the data when the user rotates the phone.  

## Delivered

#### (Purest Way)
- Request a REST API  
- Save the retrieved data locally
- Everything that works better with libraries (in my case) was replaced.

#### (Libraries and Architecture)
- The "best" architecture was applied.

#### (Extra)
- Android Jetpack: Architecture (Room, ViewModel, LiveData)
- Continuous Integration: Setup of Circle CI 2

## Not Delivered :disappointed:
- Tests: I didn't think the tests were so essential for a basic app being up and running and I left this for the last part, in case I would had time enough
- Player, Quality, Continuous Delivery (I have never worked with these, so I was trying to learn and implement)

## Improvements (I'd do if I had more time)
- The Player
- I'd implement a hide/show BottomNavigationView on scroll list
- I'd <b>try</b> to improve the architecture
- I'd try to make more tasks, applying Lint and trying to make some Instrumental and Unit Tests 
- I'd fix the bug of the fragments when the phone is rotated. When you rotate the phone in 'favorite list' part, the activity is recreated and the first fragment appears, showing the list of seached meals.
