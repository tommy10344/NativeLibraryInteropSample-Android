using Com.Example.Wrapper;

namespace App;

[Activity(Label = "@string/app_name", MainLauncher = true)]
public class MainActivity : Activity
{
    protected override void OnCreate(Bundle? savedInstanceState)
    {
        base.OnCreate(savedInstanceState);

        // Set our view from the "main" layout resource
        SetContentView(Resource.Layout.activity_main);

        var lottieView = FindViewById<LottieWrapperView>(Resource.Id.lottie_wrapper);
        lottieView.SetAnimation(Resource.Raw.bullseye);
        lottieView.SetLoop(true);
        lottieView.PlayAnimation();
    }
}