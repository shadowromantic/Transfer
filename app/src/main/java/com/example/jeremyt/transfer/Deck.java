package com.example.jeremyt.transfer;

import java.util.Random;
import java.util.Vector;

/**
 * Created by rck on 4/17/2015.
 */

// notes for Jeremy
    //to create a new category open the Encounter class and in the enum of EncounterType add the new category.
    //then in the text section add a line like
    //EncounterType encounterType = EncounterType.DOMINATION;EncounterType encounterType = EncounterType.DOMINATION;
    //and replace DOMINATION with the new Type
public class Deck {
    Random rand = new Random();
    Vector<Encounter> deck = new Vector<>();
    private Vector<Encounter> bondage = new Vector<>();
    private Vector<Encounter> puppy = new Vector<>();
    private Vector<Encounter> domination = new Vector<>();
    private Vector<Encounter> punishment = new Vector<>();
    private Vector<Encounter> submissive = new Vector<>();

    public Deck(){
            createDeck();
            createMiniDecks();
        }
    public Encounter getEncounterOfType(EncounterType encounterType){
        Encounter ret = null;
        int r;
        switch(encounterType){

            case PUPPY_PLAY:
                r = rand.nextInt(puppy.size());
                ret = puppy.elementAt(r);
                puppy.remove(ret);
                break;
            case SUBMISSIVE_TRICKS:
                r = rand.nextInt(submissive.size());
                ret = submissive.elementAt(r);
                submissive.remove(ret);
                break;
            case PUNISHMENT:
                r = rand.nextInt(punishment.size());
                ret = punishment.elementAt(r);
                punishment.remove(ret);
                break;
            case BONDAGE:
                r = rand.nextInt(bondage.size());
                ret = bondage.elementAt(r);
                bondage.remove(ret);
                break;
            case DOMINATION:
                r = rand.nextInt(domination.size());
                ret = domination.elementAt(r);
                domination.remove(ret);
                break;
        }
        if(domination.size()==0||puppy.size()==0||punishment.size()==0||submissive.size()==0||bondage.size()==0)
        {
            createMiniDecks();
        }
        return ret;
    }
    private void createDeck(){
        String title, description;
        EncounterType encounterType = EncounterType.DOMINATION;
        title ="The Inspection";
        description="Accept a chore from your dominant. But be careful. Once you complete this task, your owner will decide whether you deserve a reward or punishment.";

        deck.add(new Encounter(title,description,encounterType));

        title = "Domestic Stripping";
        description = "Accept a chore from your dominant. As you clean, you must remove an article of clothing every few seconds or minutes (at your owner’s discretion).";
        deck.add(new Encounter(title,description,encounterType));

        title = "Wet Inspection";
        description = "Take a shower with your dominant. This way, he can study your body and make sure you are nice and clean.";
        deck.add(new Encounter(title,description,encounterType));

        title = "Domestic Bindings";
        description = "Accept a chore from your owner. For this task, you must be bound in some way. Maybe your hands will be cuffed behind your back. Maybe your feet will be tied together.";
        deck.add(new Encounter(title,description,encounterType));

        title = "Clean Home, Dirty Hands";
        description = "Do the dishes, vacuum the floor, or wipe the counters. As you work, enjoy the roaming hands of your owner over your body.";
        deck.add(new Encounter(title,description,encounterType));

        title = "The Right Threads";
        description = "Take on a chore in the attire of your dominant’s choice.";
        deck.add(new Encounter(title,description,encounterType));

        title = "Clean Home, Dirty Tongue";
        description = "As you complete a chore, talk to your dominant. Promise him how you’ll be a good sub, how you’ll use your hands, lips, and tongue to please him.";
        deck.add(new Encounter(title,description,encounterType));

        title="The Right Answer";
        description = "As you clean, you are allowed to use just two answers. You may say, “Yes, Sir,” and “No, Sir.” Nothing else will be tolerated. If you forget this rule, you’ll need to be punished.";
        deck.add(new Encounter(title,description,encounterType));

        title = "The Right Answer";
        description = "As you clean, you are allowed to use just two answers. You may say, “Yes, Sir,” and “No, Sir.” Nothing else will be tolerated. If you forget this rule, you’ll need to be punished.";
        deck.add(new Encounter(title,description,encounterType));

        title = "A Rose By Any Other Name";
        description = "Pick out your servant name. This is the name your dominant will use to make you feel owned.";
        deck.add(new Encounter(title,description,encounterType));

        title = "Encouragement";
        description = "As you complete a chore of your dominant’s choosing, accept random spankings so you don’t make any mistakes.";
        deck.add(new Encounter(title,description,encounterType));

        title = "Oh So Pretty";
        description = "Sit back and imagine your perfect dress, that special uniform which will mark your position as a servant in this household. Describe this dress. If you need ideas, feel free to go online..";
        deck.add(new Encounter(title,description,encounterType));

        title = "Fetch a Drink";
        description = "Fetch a drink for your dominant. When you deliver it, don't forget to bow or curtsy.";
        deck.add(new Encounter(title,description,encounterType));

        title = "Fetch a Snack";
        description = "Fetch a snack for your dominant. When you deliver it, don't forget to bow or curtsy.";
        deck.add(new Encounter(title,description,encounterType));

        title = "The Chore Challenge";
        description = "Ask your dominant for a chore. Perform this chore while your dominant watches, but every time you make a mistake, you will lose an article of clothing.";
        deck.add(new Encounter(title,description,encounterType));

        title = "Naked Chores";
        description = "Complete a chore while naked.";
        deck.add(new Encounter(title,description,encounterType));

        title = "Practice Begging";
        description = "Get down on your knees and beg. Think about how you want to direct your eyes. Think about how you should place your hands. Beg like a good servant.";
        deck.add(new Encounter(title,description,encounterType));

        title = "Pleasure Slave";
        description = "Massage your dominant’s back.";
        deck.add(new Encounter(title,description,encounterType));

        title = "Where You Belong";
        description = "Give your dominant a foot massage. Use your fingers or your lips.";
        deck.add(new Encounter(title,description,encounterType));

        title = "Ribbons";
        description = "Find some lace. Ask your dominant whether that lace should go in your hair or around your wrists.";
        deck.add(new Encounter(title,description,encounterType));

        title = "Human Pltter";
        description = "Lay down naked. Your dominant is going to use you as a human platter. It should go without saying that if you move or make a mess, you will be punished.";
        deck.add(new Encounter(title,description,encounterType));

        encounterType = EncounterType.PUNISHMENT;
        title = "Stripped and Spanked";
        description = "You’ve disappointed your dominant. For each spanking you receive, you must also discard an article of clothing.";
        deck.add(new Encounter(title,description,encounterType));

        title = "Speak Very Carefully";
        description = "Too many submissives forget how to be quiet. With this punishment, you are allowed to speak, but you earn one spanking for every word you utter.";
        deck.add(new Encounter(title,description,encounterType));

        title = "Test of Luck";
        description = "Your dominant will get a coin and flip it. On a heads, you get spanked once. On tails, you get spanked five times. Good luck.";
        deck.add(new Encounter(title,description,encounterType));

        title = "Maintenance Spankings";
        description = "Sometimes submissives forget who’s in charge. If you’ve been a bad girl, you’ll need regular maintenance spankings. These five, ten, or fifteen spankings will be administered at random.";
        deck.add(new Encounter(title,description,encounterType));

        title = "While He Watches";
        description = "Pleasure yourself while he watches for as long as he says.";
        deck.add(new Encounter(title,description,encounterType));

        title = "Punishment Panties";
        description = "Select a pair of panties. From this point forward, when your dominant tells you to wear this pair, you must be completely obedient. Every infraction will warrant a special dose of punishment.";
        deck.add(new Encounter(title,description,encounterType));

        title = "Corner Time";
        description = "Stand in the corner. Position yourself to please your dominant. You might be on your knees. You might need to hold your hands behind your back.";
        deck.add(new Encounter(title,description,encounterType));

        title = "Collar Time";
        description = "Wear a collar for your owner. Obviously, you can’t be trusted to behave on your own. Having a special collar around your neck will remind you what it means to be owned.";
        deck.add(new Encounter(title,description,encounterType));

        title = "Bound Punishments";
        description = "Ask your dominant to tie your hands or feet. You must remain bound like this for a set period of time determined by him.";
        deck.add(new Encounter(title,description,encounterType));

        title = "Tickle Torture";
        description = "Strip. Now present yourself to your dominant to be tickled. Spankings sting, but laughing for minutes on end without relief is its own kind of torment.";
        deck.add(new Encounter(title,description,encounterType));

        encounterType = EncounterType.SUBMISSIVE_TRICKS;
        title = "Doll";
        description = "Be his toy. Be his doll. Obey every command. Don’t think. Just obey. Don’t move or speak unless he tells you to.";
        deck.add(new Encounter(title,description,encounterType));

        title = "Strip";
        description = "Undress for your dominant, removing each article as he speaks.";
        deck.add(new Encounter(title,description,encounterType));

        title = "Timed Pleasure";
        description = "Set an alarm. For this set period of time, touch yourself. Show him what turns you on the most. Move your hands along your thighs, between your legs, over your breasts…wherever you like.";
        deck.add(new Encounter(title,description,encounterType));

        title = "Reminders";
        description = "Write a naughty text message to your dominant. Make a promise. Ask a question. Be specific. He could be in the same room or across the country.";
        deck.add(new Encounter(title,description,encounterType));

        title = "Beg";
        description = "Get down on your knees. Beg for what you want. Maybe you’ll look up at him with big, soulful eyes. Or maybe you’ll keep your gaze aimed down at the floor. If you’re good, maybe he’ll say yes.";
        deck.add(new Encounter(title,description,encounterType));

        title = "Wakeup Call";
        description = "Once your dominant has enjoyed a relaxing nap, wake him up without making a sound. Use your fingertips, your lips, your breasts…whatever you like, so long as you please him.";
        deck.add(new Encounter(title,description,encounterType));

        title = "Couples Who Shop Together";
        description = "Go shopping with your dominant. Only on this trip, he decides what you buy and what you wear.";
        deck.add(new Encounter(title,description,encounterType));

        title = "Dining";
        description = "The simple intimacy of eating together is lovely. But here, your dominant orders your food and tells you when to eat.";
        deck.add(new Encounter(title,description,encounterType));

        title = "The Sweet Sounds of Submission";
        description = "Whenever a particular song comes on the radio, you must take off an article of clothing.";
        deck.add(new Encounter(title,description,encounterType));

        title = "Silent Pleas";
        description = "Beg—without making a sound. Get down on your knees, nuzzle your dominant, hold out your hands, and show him you'll be an obedient submissive.";
        deck.add(new Encounter(title,description,encounterType));

        encounterType = EncounterType.BONDAGE;
        title = "Chores";
        description = "You’re restrained for a chore. Try to sweep with your hands tied together. Your dominant will probably want to watch.";
        deck.add(new Encounter(title,description,encounterType));

        title = "Your Day Off";
        description = "Spend a full day with your hands tied together. If your dominant is particularly cruel, your hands will be tied behind your back.";
        deck.add(new Encounter(title,description,encounterType));

        title = "Penguin Shuffle";
        description = "Tie your ankles together with just three or four inches of slack. You’ll be able to walk around like a silly penguin.";
        deck.add(new Encounter(title,description,encounterType));

        title = "Dinner Time";
        description = "Tie your hands together for a meal. Your dominant might have to feed you, but that’s okay. This way you can feel like a beloved pet.";
        deck.add(new Encounter(title,description,encounterType));

        title = "Movie Affair";
        description = "Watch your favorite movie. But first, ask your dominant to tie you up. Maybe you’ll be immobile. Maybe you’ll just have your hands trapped behind your back.";
        deck.add(new Encounter(title,description,encounterType));

        title = "Bound by Obedience";
        description = "Your dominant gives you a command. He might tell you to hold your hands together. Or maybe you won’t be allowed to uncross your ankles. You’re bound by your obedience.";
        deck.add(new Encounter(title,description,encounterType));

        title = " Flip for It";
        description = "Your dominant will tie you up. He’ll flip a coin. If it’s heads, he’ll remove some of your restraints. If it’s tails, he’ll add to them.";
        deck.add(new Encounter(title,description,encounterType));

        title = "Bunny Hop";
        description = "Spend some time hopping around like a silly little bunny. Your dominant will tie your feet together, and you’ll have to jump around as best you can.";
        deck.add(new Encounter(title,description,encounterType));

        title = "Peaceful Drive";
        description = "Enjoy a peaceful ride with your dominant. You’ll be in the passenger seat with your arms and legs tied.";
        deck.add(new Encounter(title,description,encounterType));

        title = "Collar and Leash";
        description = "Here, you wear a collar and your dominant ties the leash to a hook or piece of furniture. You can still move, but he prescribes your range.";
        deck.add(new Encounter(title,description,encounterType));

        encounterType = EncounterType.PUPPY_PLAY;
        title = "Speak, Girl";
        description = "Bark for your Master. You’re his good puppy, so you need to speak. Speak, girl.";
        deck.add(new Encounter(title,description,encounterType));

        title = "Collared";
        description = "Every puppy girl needs a collar. Go online or to a store and pick out a collar. Tell your Master all about it. If you’re a lucky girl, maybe he’ll buy it for you.";
        deck.add(new Encounter(title,description,encounterType));

        title = "Roll Over";
        description = "Get down on the floor and roll around like a happy pup.";
        deck.add(new Encounter(title,description,encounterType));

        title = "Beg";
        description = "Get down on the floor and beg. Hold up your paws, let your wrists go limp, and whimper for your Master. If you’re very good, maybe he’ll give you a treat.";
        deck.add(new Encounter(title,description,encounterType));

        title = "Tag";
        description = "Every puppy needs a tag to hang from her collar. Take a few seconds and figure out what your tag will say. Does it have your puppy name? Your address? Your Master’s name?";
        deck.add(new Encounter(title,description,encounterType));

        title = "Petting, Please?";
        description = "Good puppies need to be petted. They need to know that they’re good, so crawl up to your Master and nuzzle him. Hopefully, he’ll give you some attention.";
        deck.add(new Encounter(title,description,encounterType));

        title = "Bowls";
        description = "Beg your Master for something to eat. Whimper and maybe he’ll set out a dog bowl for you. Stay down on all fours. If you get some water, remember to lap it up with the flat your tongue.";
        deck.add(new Encounter(title,description,encounterType));

        title = "Fetch";
        description = "When your Master throws a ball, chase after it. Find it and pick it up with your teeth. Then scamper back so he can do it again!";
        deck.add(new Encounter(title,description,encounterType));

        title = "Wag";
        description = "Are you a happy girl? Are you a happy little puppy? Then wag your bottom for your Master. Shake your hips from side to side as you pant.";
        deck.add(new Encounter(title,description,encounterType));

        title = "Lick";
        description = "Dogs love licking. Rush up to your Master and try to lick him. Lick his face and his thighs and his hands.";
        deck.add(new Encounter(title,description,encounterType));

        title = "Puppy Time";
        description = "Before you become a good little dog, beg your Master to set a timer. How long are you going to be at his feet, wagging and begging for treats?";
        deck.add(new Encounter(title,description,encounterType));

        title = "The Hand That Feeds You";
        description = "While your Master eats, go up to him and beg for a treat. Whimper and hold out your paws. When it’s time to eat, eat out of his hand like a good little puppy.";
        deck.add(new Encounter(title,description,encounterType));

        title = "Sit";
        description = "Get up on your haunches, hold out your paws, and stay perfectly still for your Master. Remain in this position until your Master gives you permission to move again.";
        deck.add(new Encounter(title,description,encounterType));

        title = "Balance";
        description = "Do you want a cookie? First you beg for it, and then if you’re very good, your Master will place it on the tip of your nose. Don’t let it fall!";
        deck.add(new Encounter(title,description,encounterType));

        title = "Leg Humping";
        description = "Some puppies just can’t control themselves. Maybe you’re one of them. Go find your Master, climb up on his thigh, and rub away until you come.";
        deck.add(new Encounter(title,description,encounterType));

        encounterType = EncounterType.PUNISHMENT;
        title = "Write Lines";
        description = "Sometimes students have to write lines. If you’ve disappointed your dominant, be a good girl and write out lines promising that you’ll never make the same mistake again.";
        deck.add(new Encounter(title,description,encounterType));

        title = "Body Writing";
        description = "Take a pen and write messages to your dominant. Promise your obedience. Write about how you’ll be a good submissive. Be specific.";
        deck.add(new Encounter(title,description,encounterType));

        title = "Apologize";
        description = "Think very hard. Everyone makes mistakes, so you’ve made a mistake. Get down on your knees and apologize to your dominant.";
        deck.add(new Encounter(title,description,encounterType));

        title = "Special Request";
        description = "Kneel before your dominant. You have several seconds to imagine a specific punishment. Describe this punishment to your dominant and see what happens.";
        deck.add(new Encounter(title,description,encounterType));

        title = "Ice";
        description = "Lay down in front of your dominant. Beg him for the privilege of touching you all over with a bag of ice.\n";
        deck.add(new Encounter(title,description,encounterType));

        title = "Blindfold";
        description = "Wear a blindfold for a set period of time. Submission is about trust, so give your dominant the ability to see while you must grope around.";
        deck.add(new Encounter(title,description,encounterType));

        title = "Taking Away Your Toys";
        description = "Kneel before your dominant and apologize for your infraction. Once you’ve apologized, ask your dominant to take away an article of clothing.";
        deck.add(new Encounter(title,description,encounterType));

        title = "Broke";
        description = "For one full day, give your wallet or purse to your dominant. You aren’t allowed to make any purchases. If you want something, you’ll have to ask nicely.";
        deck.add(new Encounter(title,description,encounterType));

        title = "Tour Your Home";
        description = "Take a tour of your home. In each room, promise your dominant that you’ll be a good submissive.";
        deck.add(new Encounter(title,description,encounterType));

        title = "The Silent Treatment";
        description = "Beg your dominant to gag you, especially if you’ve said something inappropriate. Until your dominant decides otherwise, you aren’t allowed to speak.";
        deck.add(new Encounter(title,description,encounterType));

        encounterType = EncounterType.PONY_PLAY;
        title = "Whinny";
        description = "Go ahead. Do it. Whinny for your owner. Show him you’re a good pony.";
        deck.add(new Encounter(title,description,encounterType));

        title = "Treat";
        description = "While down on your hands and knees, crawl forward and nuzzle your owner. If you are lucky, maybe you will get a sugar cube.";
        deck.add(new Encounter(title,description,encounterType));

        title = "Feeding Time";
        description = "Crawl to your owner. Nuzzle him with your nose and maybe you will be fed. But what do ponies like to eat most of all? That's right. Apples.";
        deck.add(new Encounter(title,description,encounterType));

        title = "Prance Pony";
        description = "Dance for your owner. Prance around on all fours. Spin around, Seidel from side to side, and show your owner how you're a happy pony.";
        deck.add(new Encounter(title,description,encounterType));

        title = "Dressage";
        description = "Dressage the art of maneuvering a horse. As a human pony, show your owner that you can move gracefully. Step forward and back, left and right, all with perfect grace.";
        deck.add(new Encounter(title,description,encounterType));

        title = "Petting";
        description = "Approach your owner and tilt your head to the side. Lean in. Rub your hair over your owner’s hands. If you are very good, maybe you will get it petting.";
        deck.add(new Encounter(title,description,encounterType));

        title = "Grooming";
        description = "It’s time to groom the pony. Enjoy the feel of the brush through your hair.";
        deck.add(new Encounter(title,description,encounterType));

        title = "Bridle";
        description = "Bring a piece of rope to your owner. If your owner is feeling very generous, perhaps he will slide it between your teeth. You are pony, after all. You need a bridle.";
        deck.add(new Encounter(title,description,encounterType));

        title = "Inspection";
        description = "Ponies need to be inspected. Either down on all fours or on your feet with your back straight, prepare yourself to be inspected. Your owner will examine your chest, your legs, your pretty face, and perhaps even your teeth.";
        deck.add(new Encounter(title,description,encounterType));

        title = "Speed";
        description = "Show your owner just how fast you can go, pony girl. Your owner will follow you through your home, spanking you or striking with a crop or whip because sometimes you need an incentive.";
        deck.add(new Encounter(title,description,encounterType));

        encounterType = EncounterType.OFFICE_GAMES;
        title = "Proper Respect";
        description = "You must always show your dominant proper respect. From now on, you will address your dominant as Sir or Ma’am.";
        deck.add(new Encounter(title,description,encounterType));

        title = "Proper Respect";
        description = "An important aspect of being subservient is wearing proper attire. Ask your dominant what you should wear. Once you are dressed, present yourself for inspection.";
        deck.add(new Encounter(title,description,encounterType));

        title = "Appologies";
        description = "Remember, the boss is always right. Practice apologizing to your superior. Tell your dominant what you did wrong and tell him just how sorry you are.";
        deck.add(new Encounter(title,description,encounterType));

        title = "The First Step";
        description = "Offer yourself up for a job interview. Answer every question, no matter how personal.";
        deck.add(new Encounter(title,description,encounterType));

        title = "New Position";
        description = "Go to your dominant and ask for a promotion. If you have been a good little servant, maybe you will get a new title.";
        deck.add(new Encounter(title,description,encounterType));

        title = "Ask For It";
        description = "Go to your dominant and ask for a raise. Remember, you might be forced to demonstrate your skills. Otherwise, how would your boss know what you really deserve?";
        deck.add(new Encounter(title,description,encounterType));

        title = "Dictation";
        description = "Get down on your knees or curl up on your dominant’s lap with a pen and notebook. Be prepared to write down whatever you're dominant says.";
        deck.add(new Encounter(title,description,encounterType));

        title = "Under the Desk";
        description = "Sometimes answering e-mails can be incredibly boring for your boss. Get down on your knees, under his desk, and prepare to service him while he types away on his keyboard.";
        deck.add(new Encounter(title,description,encounterType));

        title = "ID";
        description = "Lots of employees must wear tags. Consider what yours will say. How will your boss identify you? What will your job title be? Be sure to get your employer’s approval.";
        deck.add(new Encounter(title,description,encounterType));

        title = "Job Description";
        description = "You need a job description. Go to your dominant, get down on your knees, and declare what you can do. Be specific. Be detailed. Be prepared to answer questions.";
        deck.add(new Encounter(title,description,encounterType));

        encounterType = EncounterType.CLASSROOM_GAMES;
        title = "Corner Time";
        description = "You know what you’ve done. Go stand in the corner until your dominant teacher allows you to return to your seat.";
        deck.add(new Encounter(title,description,encounterType));

        title = "The Ruler";
        description = "If you have been a bad student, you need to be punished. Prepare to crawl onto your teacher’s lap so that you can be spanked with a ruler. This is one lesson he won't soon forget..";
        deck.add(new Encounter(title,description,encounterType));

        title = "Lines";
        description = "Take out a piece of paper and something to write with. Ask your teacher what sentence he must write over and over again. Remember. Penmanship counts..";
        deck.add(new Encounter(title,description,encounterType));

        title = "Panty Inspection";
        description = "Some students try to go to school without the proper attire. Be prepared to show your panties to your dominant teacher.";
        deck.add(new Encounter(title,description,encounterType));

        title = "Oral Exam";
        description = "Kneel before your teacher. Be prepared to service your dominant with that cute little mouth of yours.";
        deck.add(new Encounter(title,description,encounterType));

        title = "Pigtails";
        description = "Tie ribbons in your hair. You need to make it abundantly clear that you understand your place in the classroom. Your teacher is in charge. You simply do as you're told.";
        deck.add(new Encounter(title,description,encounterType));

        title = "Doodles";
        description = "Go ahead and write out a sentence about how you have a crush on your teacher. Be sure to dot all of the i’s with hearts.";
        deck.add(new Encounter(title,description,encounterType));

        title = "Poise";
        description = "Poise is very important for a student. While your dominant watches, place a book on your head and walk across the room. If the book falls off, expect a spanking.";
        deck.add(new Encounter(title,description,encounterType));

        title = "Dance";
        description = "Do a little dance for your teacher. Show your dominant just how excited you can get by shaking that cute bottom of yours.";
        deck.add(new Encounter(title,description,encounterType));

        title = "Grateful";
        description = "Since you've learned so much from your dominant teacher, get down on your knees and be prepared to show your gratitude. You get to use your mouth or fingers.";
        deck.add(new Encounter(title,description,encounterType));
    }

    private void createMiniDecks(){
        puppy.clear();
        submissive.clear();
        punishment.clear();
        bondage.clear();
        domination.clear();
        for (int i = 0; i < deck.size(); i++){
            Encounter currentEncounter = deck.elementAt(i);
            switch(currentEncounter.encounterType){
                case PUPPY_PLAY:
                    puppy.add(currentEncounter);
                    break;
                case SUBMISSIVE_TRICKS:
                    submissive.add(currentEncounter);
                    break;
                case PUNISHMENT:
                    punishment.add(currentEncounter);
                    break;
                case BONDAGE:
                    bondage.add(currentEncounter);
                    break;
                case DOMINATION:
                    domination.add(currentEncounter);
                    break;
                default:
                    System.out.println("default case");
            }
        }
    }
}
